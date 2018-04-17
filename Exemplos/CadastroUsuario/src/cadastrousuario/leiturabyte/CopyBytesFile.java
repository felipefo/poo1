/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastrousuario.leiturabyte;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBytesFile {
    public static void main(String[] args) throws IOException {

        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            String current = new java.io.File( "." ).getCanonicalPath();    
            in = new FileInputStream(current + "\\file.csv");
            out = new FileOutputStream(current + "\\saida.csv");
            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
                System.out.println((char)c);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}
