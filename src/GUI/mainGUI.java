/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BUS.TaiKhoanBUS;
import BUS.Tool;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public class mainGUI {
    public static void main(String args[]){
        try
        {
            //Hàm đọc tất cả dữ liệu
            Tool.docDB();
            //chạy form đăng nhập
            new LoginGUI().setVisible(true);
        }
        catch(Exception e0){
            e0.printStackTrace();
        }
        
    }
}


