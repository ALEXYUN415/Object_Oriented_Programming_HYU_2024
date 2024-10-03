package week13;

public class DownloadFile implements Runnable {
    private String fileName;
    private int size;

    public DownloadFile(String fileName, int size) {
        this.fileName = fileName;
        this.size = size;
    }

    @Override
    public void run() {
        try {
            System.out.println("Starting download for: " + fileName);
            Thread.sleep(size);  // 다운로드 시간을 파일 크기에 비례하여 시뮬레이션
            System.out.println("Completed download for: " + fileName);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}