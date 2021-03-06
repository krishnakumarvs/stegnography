/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package WaterMark;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author kakes
 */
public class AddWaterMark {

    public static void addNow(File origFile, String fontFamily, int fontSize, String waterMarkTitle, float opacity, String color) {
        ImageIcon icon = new ImageIcon(origFile.getPath());
        System.out.println("fontFamily " + fontFamily);
        System.out.println("fontSize " + fontSize);
        System.out.println("waterMarkTitle " + waterMarkTitle);
        // create BufferedImage object of same width and height as of original image
        BufferedImage bufferedImage = new BufferedImage(icon.getIconWidth(),
                icon.getIconHeight(), BufferedImage.TYPE_INT_RGB);

        // create graphics object and add original image to it
        Graphics2D graphics = (Graphics2D) bufferedImage.getGraphics();

        graphics.drawImage(icon.getImage(), 0, 0, null);

        // set font for the watermark text
        graphics.setFont(new Font(fontFamily, Font.BOLD, fontSize));

        Color colorValue = Color.white;

        if (color.equals("pink")) {
            colorValue = Color.pink;
        } else if (color.equals("white")) {
            colorValue = Color.white;
        } else if (color.equals("orange")) {
            colorValue = Color.orange;
        } else if (color.equals("cyan")) {
            colorValue = Color.cyan;
        } else if (color.equals("magenta")) {
            colorValue = Color.magenta;
        } else if (color.equals("gray")) {
            colorValue = Color.gray;
        } else if (color.equals("yellow")) {
            colorValue = Color.yellow;
        } else if (color.equals("black")) {
            colorValue = Color.black;
        } else if (color.equals("green")) {
            colorValue = Color.green;
        } else if (color.equals("red")) {
            colorValue = Color.red;
        } else if (color.equals("blue")) {
            colorValue = Color.blue;
        }

        graphics.setColor(colorValue);

        //unicode characters for (c) is \u00a9

        AlphaComposite alphaChannel = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, opacity);
        graphics.setComposite(alphaChannel);

        // add the watermark text
        graphics.drawString(waterMarkTitle, (icon.getIconWidth() / 2), (icon.getIconHeight() / 2));
        graphics.dispose();

        File newFile = new File("D:/WatermarkedImage2.jpg");
        try {
            ImageIO.write(bufferedImage, "jpg", origFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(newFile.getPath() + " created successfully!");
    }

    public static void main(String args[]) {
        float opacity = (float) 0.8;
        addNow(new File("D:/WatermarkedImage.jpg"), "Arial", 30, "helooo", opacity, "red");
    }
}
