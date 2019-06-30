package pl.LachTom;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;

public class FolderSearch {
    public void searchFolder()
    {
        String path = "D:\\logs";

        File dir = new File(path);
        File[] files = dir.listFiles();

        Arrays.sort(files, new Comparator<File>() {
            public int compare(File f1, File f2) {
                return Long.valueOf(f2.lastModified()).compareTo(
                        f1.lastModified());
            }
        });

        for (int index = 0; index < files.length; index++) {
            System.out.println((index + 1) + " lastModified file: ");
            System.out.println(files[index].getName());
        }
    }
}

