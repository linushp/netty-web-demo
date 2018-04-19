package com.github.luanhaipeng.nettyweb.test;

import cn.ubibi.nettyweb.framework.rest.WebServer;

public class MainServer {
    public static void main(String[] args) throws Exception {
        WebServer webServer = new WebServer(8002);
        webServer.autoConfigByScanPackage(MainServer.class);
        webServer.start();
    }
}
