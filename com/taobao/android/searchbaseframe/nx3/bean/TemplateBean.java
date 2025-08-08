package com.taobao.android.searchbaseframe.nx3.bean;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.util.e;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes6.dex */
public class TemplateBean implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EAGLE_SUFFIX = "-bin";
    public boolean binary;
    public boolean cellBinary;
    public String dItemType;
    public boolean forceDownload;
    public String isGray;
    public int listHeight;
    public String md5;
    public int midHeight;
    public int required;
    public int[] supportedStyle;
    public String templateName;
    public String url;
    public String version;

    static {
        kge.a(-353939371);
        kge.a(1028243835);
    }

    public String getFileName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("787e7f7c", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.templateName);
        sb.append("-");
        sb.append(this.version);
        sb.append(this.binary ? EAGLE_SUFFIX : "");
        return sb.toString();
    }

    public static boolean isBinaryFile(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b60a4d3c", new Object[]{str})).booleanValue();
        }
        if (str != null) {
            return str.endsWith(EAGLE_SUFFIX);
        }
        return false;
    }

    public static e<String, String> getTemplateNameAndVersion(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("8d7df2b8", new Object[]{str});
        }
        if (str == null) {
            return null;
        }
        if (isBinaryFile(str)) {
            str = str.substring(0, str.length() - 4);
        }
        int lastIndexOf = str.lastIndexOf(45);
        if (lastIndexOf >= 0) {
            return e.a(str.substring(0, lastIndexOf), str.substring(lastIndexOf + 1));
        }
        return null;
    }

    public String toPrintString() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a5db8b36", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%s\n    %s\n    %s", getFileName(), this.url, this.md5));
        if (StringUtils.isEmpty(this.dItemType)) {
            str = "";
        } else {
            str = "    dItemType: " + this.dItemType;
        }
        sb.append(str);
        return sb.toString();
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "TemplateBean{templateName='" + this.templateName + "', url='" + this.url + "', version='" + this.version + "', md5='" + this.md5 + "', dItemType='" + this.dItemType + "', listHeight=" + this.listHeight + ", midHeight=" + this.midHeight + '}';
    }
}
