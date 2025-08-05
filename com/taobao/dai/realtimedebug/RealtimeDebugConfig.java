package com.taobao.dai.realtimedebug;

import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;

/* loaded from: classes7.dex */
public class RealtimeDebugConfig implements Serializable {
    @JSONField(name = "allowExternLog")
    public boolean allowExternLog = true;
    @JSONField(name = "clog")
    public boolean clog;
    @JSONField(name = "debugId")
    public String debugId;
    @JSONField(name = "mockConfig")
    public String mockConfig;
    @JSONField(name = "openDebugType")
    public boolean openDebugType;
    @JSONField(name = "permanentTest")
    public boolean permanentTest;
    @JSONField(name = "runTasks")
    public String runTasks;
}
