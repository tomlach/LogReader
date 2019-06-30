package pl.LachTom;

import java.io.IOException;


public class App {
    public static void main(String[] args) throws IOException {

        Service service = new Service();
        FolderSearch folderSearch = new FolderSearch();

        folderSearch.searchFolder();

        service.readFile();
        service.whatTimeLogs();
        service.typeOfLogs();
        service.uniqueLogs();

    }
}


