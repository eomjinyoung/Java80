package step34.exam05;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class DicServer {

  public static void main(String[] args) {
    ServerSocket serverSocket = null;
    Socket socket = null;
    
    try {
      System.out.println("서버 준비 중...");
      serverSocket = new ServerSocket(9999);
      while (true) {
        System.out.println("클라이언트 대기 중...");
        socket = serverSocket.accept();
        echo(socket);
      }
      
    } catch (Exception e) {
      e.printStackTrace();
      
    } finally {
      try {serverSocket.close();} catch (Exception e) {}
    }
  }
  
  private static void echo(Socket socket) {
    Scanner in = null;
    PrintStream out = null;
    String message = null;
    
    try {
      in = new Scanner(socket.getInputStream());
      out = new PrintStream(socket.getOutputStream());
      
      while (true) {
        message = in.nextLine();
        
        if (message.equals("quit")) {
          out.println("즐거운 하루되세요.");
          break;
        }

        out.println(toKor(message));
        
      }
      
    } catch (Exception e) {
      System.out.println("클라이언트 통신 오류!");
    } finally {
      try {in.close();} catch (Exception e) {}
      try {out.close();} catch (Exception e) {}
      try {socket.close();} catch (Exception e) {}
    }
  }
  
  private static String toKor(String word) {
    return "오호라";
  }

}









