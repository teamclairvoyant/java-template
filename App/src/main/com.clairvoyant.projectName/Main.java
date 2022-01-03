package com.clairvoyant.projectName;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.FileUtil;
import org.apache.hadoop.fs.Path;

import java.io.IOException;

public class Main implements ISampleInterface {

    public void sampleMethod() throws IOException {

        //Code to copy from {Local} TO {HDFS}
        Configuration configuration = new Configuration();
        configuration.set("fs.defaultFS", "hdfs://abc:9000"); //HDFS server
        FileSystem filesystem = FileSystem.get(configuration);
        FileUtil.copy(filesystem, new Path("Employee_sample.csv"), //source path

                                        //destination path
                filesystem, new Path("/test"), false, configuration);
    }

    //Main Code Goes Here
    public static void main(String[] args) throws IOException {
        Main m = new Main();
        m.sampleMethod();
    }
}
