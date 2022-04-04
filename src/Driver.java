import java.io.*;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.security.SecureRandom;

public class Driver {
    public static void main(String[] args) throws FileNotFoundException {
        boolean r = true;
        Scanner s = new Scanner(System.in);
        SecureRandom random = new SecureRandom();
        ArrayList<oneyearmember> ListOne = new ArrayList<oneyearmember>();
        ArrayList<sixmonthmember> ListSix = new ArrayList<sixmonthmember>();
        File file1 = new File("C:\\Users\\Asus\\IdeaProjects\\SE 116 Proje\\OneYear.txt");
        File file2 = new File("C:\\Users\\Asus\\IdeaProjects\\SE 116 Proje\\SixMonth.txt");
        File file3 = new File("C:\\Users\\Asus\\IdeaProjects\\SE 116 Proje\\Guest.txt");
        try {
            file1.createNewFile();
        } catch (IOException e) {
            System.out.println("File does not created");
        }
        try {
            file2.createNewFile();
        } catch (IOException e) {
            System.out.println("File does not created");
        }
        try {
            file3.createNewFile();
        } catch (IOException e) {
            System.out.println("File does not created");
        }
        while (r) {
            System.out.println("****Welcome to the A.Y.M. Autopark Systems****");
            System.out.println("Are you a member of our system ? (Please enter Yes or No)");
            String ans = s.next();
            if (ans.equals("Yes")) {
                System.out.println("Please select your membership type: ");
                System.out.println("1) 6 Month Membership");
                System.out.println("2) 1 Year Membership");
                int x = s.nextInt();

                if (x == 1) {
                    System.out.println("Please enter your choice: ");
                    System.out.println("1)Print my informaiton.");
                    System.out.println("2)Terminate the programm.");
                    int u = s.nextInt();
                    if (u == 1) {
                        System.out.println("Please enter your ID");
                        int o = s.nextInt();
                        for (int i = 0; i < ListSix.size(); i++) {
                            if (o == ListSix.get(i).getID()) {
                                ListSix.get(i).PrintInfo();
                            } else {
                                System.out.println("Wrong ID!!");
                            }
                        }

                    } else if (u == 2) {
                        r = false;
                    }
                } else if (x == 2) {
                    System.out.println("Please enter your choice: ");
                    System.out.println("1)Print my informaiton.");
                    System.out.println("2)Terminate the programm.");
                    int u = s.nextInt();
                    if (u == 1) {
                        System.out.println("Please enter your ID");
                        int o = s.nextInt();
                        for (int i = 0; i < ListOne.size(); i++) {
                            if (o == ListOne.get(i).getID()) {
                                ListOne.get(i).PrintInfo();
                            } else {
                                System.out.println("Wrong ID!!");
                            }

                        }

                    } else if (u == 2) {
                        r = false;
                    }
                }
            }
            else if (ans.equals("No")) {
                System.out.println("Do you want to be a member of our system ?");
                System.out.println("If you say YES, you can have some advantages");
                System.out.println("If you say NO, you can continue as a guest");
                String choise = s.next();

                if (choise.equals("YES")) {
                    System.out.println("Which type membership do you prefer ?");
                    System.out.println("1) 6 month membership");
                    System.out.println("2) 1 year membership");
                    System.out.println("3)Terminate the programm");
                    int y = s.nextInt();
                    if (y == 1) {
                        try {
                            FileWriter write2 = new FileWriter(file2);
                            int counterSix = 0;
                            sixmonthmember newsix = new sixmonthmember();
                            System.out.println("Please enter your name: ");
                            newsix.setName(s.next());
                            write2.write(newsix.getName());
                            StringReader stringread0 = new StringReader(newsix.getName());
                            System.out.println("Please enter your surname: ");
                            newsix.setSurname(s.next());
                            write2.write(newsix.getSurname());
                            StringReader stringread1 = new StringReader(newsix.getSurname());
                            System.out.println("Please select your password (Password should be a 1-10 numbers): ");
                            newsix.setPassword(s.nextInt());
                            write2.write(String.valueOf(newsix.getPassword()));
                            StringReader stringread2 = new StringReader(String.valueOf(newsix.getPassword()));
                            System.out.println("Please enter your city code: ");
                            newsix.setCitycode(s.nextInt());
                            write2.write(String.valueOf(newsix.getCitycode()));
                            StringReader stringread3 = new StringReader(String.valueOf(newsix.getCitycode()));
                            System.out.println("Please enter your letters: ");
                            newsix.setLetters(s.next());
                            write2.write(newsix.getLetters());
                            StringReader stringread4 = new StringReader(newsix.getLetters());
                            System.out.println("Please enter your last four integers: ");
                            newsix.setFourint(s.nextInt());
                            write2.write(String.valueOf(newsix.getFourint()));
                            StringReader stringread5 = new StringReader(String.valueOf(newsix.getFourint()));
                            int randomsayı = random.nextInt(1000);
                            newsix.setID(randomsayı);
                            write2.write(String.valueOf(randomsayı));
                            write2.close();
                            ListSix.add(counterSix, newsix);
                            System.out.println("Your ID is: " + newsix.getID());
                            ListSix.get(counterSix).PrintInfo();
                            System.out.println("Welcome to the A.Y.M. Autopark Systems !!!!");
                        } catch (IOException e) {
                            System.out.println("Error");
                        }
                    } else if (y == 2) {
                        try {
                            FileWriter write1 = new FileWriter(file1);
                            int counterOne = 0;
                            oneyearmember newone = new oneyearmember();
                            System.out.println("Please enter your name: ");
                            newone.setName(s.next());
                            write1.write(newone.getName());
                            StringReader stringread0 = new StringReader(newone.getName());
                            System.out.println("Please enter your surname: ");
                            newone.setSurname(s.next()+" ");
                            write1.write(newone.getSurname());
                            StringReader stringread1 = new StringReader(newone.getSurname());
                            System.out.println("Please select your password (Password should be a 1-10 numbers): ");
                            newone.setPassword(s.nextInt());
                            write1.write(String.valueOf(newone.getPassword()));
                            StringReader stringread2 = new StringReader(String.valueOf(newone.getPassword()));
                            System.out.println("Please enter your city code: ");
                            newone.setCitycode(s.nextInt());
                            write1.write(String.valueOf(newone.getCitycode()));
                            StringReader stringread3 = new StringReader(String.valueOf(newone.getCitycode()));
                            System.out.println("Please enter your letters: ");
                            newone.setLetters(s.next());
                            write1.write(newone.getLetters());
                            StringReader stringread4 = new StringReader(newone.getLetters());
                            System.out.println("Please enter your last four integers: ");
                            newone.setFourint(s.nextInt());
                            write1.write(String.valueOf(newone.getFourint()));
                            StringReader stringread5 = new StringReader(String.valueOf(newone.getFourint()));
                            newone.setID(random.nextInt(1000));
                            ListOne.add(counterOne, newone);
                            int randomsayı = random.nextInt(1000);
                            newone.setID(randomsayı);
                            write1.write(String.valueOf(randomsayı));
                            StringReader stringread6 = new StringReader(String.valueOf(newone.getID()));
                            write1.close();
                            System.out.println("Your ID is: " + newone.getID());
                            ListOne.get(counterOne).PrintInfo();
                            System.out.println("Welcome to the A.Y.M. Autopark Systems !!!!");
                        } catch (IOException e) {
                            System.out.println("Error");
                        }
                    }
                    else if (y == 3) {
                        r = false;
                    }
                }
                else if (choise.equals("NO")) {
                    try {
                        FileWriter write3 = new FileWriter(file3);
                        BufferedWriter writer3 =new BufferedWriter(new BufferedWriter(write3));
                        ordinaryuser user = new ordinaryuser();
                        System.out.println("Please enter your city code: ");
                        user.setCitycode(s.nextInt());
                        writer3.write(String.valueOf(user.getCitycode()));
                        StringReader stringread0 = new StringReader(String.valueOf(user.getCitycode()));
                        System.out.println("Please enter your letters: ");
                        user.setLetters(s.next());
                        writer3.write(user.getLetters());
                        StringReader stringread1 = new StringReader(user.getLetters());
                        System.out.println("Please enter your four last numbers: ");
                        user.setFourint(s.nextInt());
                        writer3.write(String.valueOf(user.getFourint()));
                        StringReader stringread2 = new StringReader(String.valueOf(user.getFourint()));
                        user.PrintTicket();
                        writer3.newLine();
                        writer3.close();
                    }
                    catch (IOException e) {
                        System.out.println("Error");
                    }
                }
            }
        }


    }
}



