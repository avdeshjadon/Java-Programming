// Encryptable Interface with Encryption and Decryption
//
// Problem: Write a Java program to create an interface Encryptable with methods encrypt(String data)
// and decrypt(String encryptedData) that define encryption and decryption operations.
// Create two classes AES and RSA that implement the Encryptable interface and provide
// their own encryption and decryption algorithms.
//
// Sample Output:
// AES Encrypted Data: encryptedAESData
// AES Decrypted Data: originalData
// RSA Encrypted Data: encryptedRSAData
// RSA Decrypted Data: originalData

package OOPS.JavaInterface;

interface Encryptable {
    String encrypt(String data);
    String decrypt(String encryptedData);
}

class AES implements Encryptable {
    @Override
    public String encrypt(String data) {
        // Simple simulation of AES encryption
        return "AES_" + data + "_ENCRYPTED";
    }

    @Override
    public String decrypt(String encryptedData) {
        // Simple simulation of AES decryption
        if (encryptedData.startsWith("AES_") && encryptedData.endsWith("_ENCRYPTED")) {
            return encryptedData.substring(4, encryptedData.length() - 10);
        }
        return "Invalid AES data";
    }
}

class RSA implements Encryptable {
    @Override
    public String encrypt(String data) {
        // Simple simulation of RSA encryption
        return "RSA_" + data + "_ENCRYPTED";
    }

    @Override
    public String decrypt(String encryptedData) {
        // Simple simulation of RSA decryption
        if (encryptedData.startsWith("RSA_") && encryptedData.endsWith("_ENCRYPTED")) {
            return encryptedData.substring(4, encryptedData.length() - 10);
        }
        return "Invalid RSA data";
    }
}

public class InterfaceEncryptable {
    public static void main(String[] args) {
        String originalData = "originalData";
        
        AES avdeshAES = new AES();
        RSA amanRSA = new RSA();
        
        String aesEncrypted = avdeshAES.encrypt(originalData);
        String aesDecrypted = avdeshAES.decrypt(aesEncrypted);
        
        String rsaEncrypted = amanRSA.encrypt(originalData);
        String rsaDecrypted = amanRSA.decrypt(rsaEncrypted);
        
        System.out.println("AES Encrypted Data: " + aesEncrypted);
        System.out.println("AES Decrypted Data: " + aesDecrypted);
        System.out.println("RSA Encrypted Data: " + rsaEncrypted);
        System.out.println("RSA Decrypted Data: " + rsaDecrypted);
    }
}