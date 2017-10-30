package cn.tedu.xjqxz;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * 游戏案例的窗口类
 * 窗口大小：1024 * 768
 *
 * @author fgksgf
 */
public class GameFrame {
    public static void main(String[] args) {
        /*
         * 1.创建窗口类的实例化对象
         * 2.让窗口对象显示出来
         * 3.设置窗口对象的相关属性
         */

        final int width = 1024;
        final int height = 768;

        JFrame jFrame = new JFrame();
        jFrame.setSize(width, height);
        jFrame.setLocationRelativeTo(null);
        jFrame.setResizable(false);
        jFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        jFrame.addWindowListener(new WindowAdapter() {
            // 当窗口正要关闭的时候，会自动调用该方法
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                // 弹出确认对话框
                int ch = JOptionPane.showConfirmDialog(null,"确认退出游戏吗？","提示",JOptionPane.YES_NO_OPTION);
                if (ch == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            }
        });


        jFrame.setTitle("仙剑奇侠传 - Version 1.0");


        GamePanel gamePanel = new GamePanel();
        jFrame.addKeyListener(gamePanel);
        jFrame.add(gamePanel);

        jFrame.setVisible(true);

    }
}
