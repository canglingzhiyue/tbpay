package com.taobao.weex.adapter;

import mtopsdk.common.util.StringUtils;
import android.util.Pair;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes9.dex */
public interface IWXJSEngineManager {

    /* loaded from: classes9.dex */
    public enum EngineType {
        QuickJSBin("QJSBin", false, 2),
        QuickJS("QJS", false, QuickJSBin.engineValue | 4);
        
        private String engineName;
        private int engineValue;
        private boolean switchValue;
        private CopyOnWriteArrayList<String> urlList = new CopyOnWriteArrayList<>();

        EngineType(String str, boolean z, int i) {
            this.switchValue = z;
            this.engineName = str;
            this.engineValue = i;
        }

        public String engineName() {
            return this.engineName;
        }

        public boolean engineOn() {
            return this.switchValue;
        }

        public int engineValue() {
            return this.engineValue;
        }

        public boolean hasPage(String str) {
            if (StringUtils.isEmpty(str)) {
                return false;
            }
            return this.urlList.contains(str);
        }

        public void setEngineValue(boolean z) {
            this.switchValue = z;
        }
    }

    EngineType defaultEngine();

    boolean enableMainProcessScriptSide();

    Pair<EngineType, String> engineType(String str);

    boolean forceAllPageRunInMainProcessScriptSide();

    boolean runInMainProcess(String str);

    void setEngineSwitchValue(EngineType engineType, boolean z);

    void updateDisableUrlData(String str);

    void updateEnableUrlData(String str);
}
