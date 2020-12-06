/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankingapplication3;

import java.util.Scanner;

/**
 *
 * @author rishab lachuriye
 */
public class BankingApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          
   
BankAccount obj1=new BankAccount("XYZ","BA0001");
        obj1.showmenu();
        
    }
    
}

        class BankAccount{
            int balance;
            int previousTransaction;
            String customerName;
            String customerId;
            
           BankAccount(String cname, String cid){
               
               customerName = cname;
               customerId = cid;
            
        }
            
            void deposite(int amount){
                if(amount!=0){
                balance = balance + amount;
                previousTransaction = amount;
               }
            }
            void withdraw (int amount2){
                
                if(amount2!=0){
                    balance = balance - amount2;
                    previousTransaction = - amount2;
                }
            }
            void getPreviousTransaction(){
                if (previousTransaction > 0){
                    System.out.println("Deposited: " +previousTransaction);
                } 
                
                
                else if( previousTransaction <0){
                            System.out.println("Withdrawn: " +Math.abs(previousTransaction));
                }
                
                
                 else{
                            System.out.println("There is no transaction");
                }
                }
            
           void showmenu(){
            
                    char option='\0';
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Welcome" +customerName);
                    System.out.println("Your customer id is" +customerId);
                    System.out.println("Please choose the required opertion you want to perform");
                    System.out.println("A.check Balance");
                    System.out.println("B.Deposit");
                    System.out.println("C.Withdraw");
                    System.out.println("D.PreviousTranscation");
                    System.out.println("E.Exit");
                    
                    do{
                        
                        System.out.println("------------------------------------");
                        System.out.println("Enter an option");
                        System.out.println("------------------------------------");
                        option=scanner.next().charAt(0);
                        System.out.println("\n");
                        
                 switch(option){
                        
                                
 
                        case 'A':
                                    System.out.println("------------------------");
                                    System.out.println("Balance"+balance);
                                    System.out.println("------------------------");
                                    System.out.println("\n");
                        break;
                        case 'B':
                            System.out.println("--------------------------------");
                            System.out.println("Enter an amount to deposite");
                            System.out.println("--------------------------------");
                        int amount = scanner.nextInt();
                        deposite(amount);
                            System.out.println("\n");
                        break;
                        case 'C':
                            System.out.println("--------------------------------");
                            System.out.println("Enter an amount to withdraw");
                            System.out.println("--------------------------------");
                             int amount2=scanner.nextInt();
                             withdraw( amount2);
                            System.out.println("\n");
                        break;
                        
                        case 'D':
                            System.out.println("--------------------------------");
                        getPreviousTransaction();
                            System.out.println("--------------------------------");
                            System.out.println("\n");
                        break;
                        
                        case 'E':
                            System.out.println("********************************");
                            break;
                            
                        default:
                            System.out.println("Invalid option ");
                        break;
                      }
                    }
                    
                       
while(option!='E');
                    System.out.println("Thank you for your services");
           }

        }
