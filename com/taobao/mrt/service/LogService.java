package com.taobao.mrt.service;

import tb.dqy;

/* loaded from: classes7.dex */
public interface LogService {

    /* loaded from: classes7.dex */
    public enum LogLevel {
        INFO("INFO"),
        DEBUG("DEBUG"),
        WARNING("WARN"),
        ERROR("ERROR"),
        MODEL("MODEL"),
        CONFIG("CONFIG");
        
        public String name;

        LogLevel(String str) {
            this.name = str;
        }
    }

    /* loaded from: classes7.dex */
    public enum LogReceiver {
        None(0),
        Console(1),
        All(2),
        WorkStation(3);
        
        public int value;

        LogReceiver(int i) {
            this.value = i;
        }
    }

    /* loaded from: classes7.dex */
    public enum LogSource {
        JAVA("java"),
        C("C"),
        PYTHON(dqy.TYPE);
        
        public String name;

        LogSource(String str) {
            this.name = str;
        }
    }
}
