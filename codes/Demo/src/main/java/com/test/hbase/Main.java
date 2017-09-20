package com.test.hbase;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.client.Connection;
import org.apache.hadoop.hbase.client.CoprocessorHConnection;
import org.apache.hadoop.hbase.client.HBaseAdmin;
import org.apache.hadoop.hbase.regionserver.HRegionServer;
import org.apache.hadoop.hbase.regionserver.MetricsRegionServer;

/**
 * Created by DaiYan on 2017/9/20.
 */
public class Main {
    public static void main(String[] args) throws Exception{
        Configuration config=new Configuration(true);
        HRegionServer regionServer=new HRegionServer(config);
        Connection conn=new CoprocessorHConnection(config,regionServer);
        HBaseAdmin client=new HBaseAdmin(conn);
        
    }
}
