package com.taobao.weex.utils.tools;

import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Locale;
import tb.kge;
import tb.ovr;
import tb.riy;

/* loaded from: classes.dex */
public class LogDetail {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KeyWords_Render = "Weex_Render";
    public static final String KeyWrod_Init = "Weex_Init";
    public String keyWords = KeyWords_Render;
    @JSONField(name = "time")
    public Time time = new Time();
    @JSONField(name = "Info")
    public Info info = new Info();

    static {
        kge.a(-58790680);
    }

    public void println() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16573df6", new Object[]{this});
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "taskName : " + this.info.taskName + " - LogDetail : {time = '" + this.time + "', info = '" + this.info + '\'' + riy.BLOCK_END_STR;
    }

    public void name(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ac56adc", new Object[]{this, str});
            return;
        }
        this.time.a();
        this.info.taskName = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        if (!lowerCase.contains("module") && !lowerCase.contains("component") && !lowerCase.contains(ovr.KEY_TAB_BAR_FRAMEWORK)) {
            return;
        }
        this.keyWords = KeyWrod_Init;
    }

    public void keyWorkds(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e81443f0", new Object[]{this, str});
        } else {
            this.keyWords = str;
        }
    }

    public void taskStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f39297e4", new Object[]{this});
        } else {
            this.time.taskStart();
        }
    }

    public void taskEnd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10aa3a9d", new Object[]{this});
            return;
        }
        this.time.taskEnd();
        println();
    }
}
