/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestPackage;
import StockService.*;
import StockService.service.*;
/**
 *
 * @author Ihab BERRO
 */
public class main {
    public static void main(String[] args) {
        User u;
        UserFacadeREST ufs = new UserFacadeREST();
        u = ufs.find(0);
        System.out.print(u.getUserName());
    }
}
