package com.alipay.mobile.security.bio.config.bean;

import com.alipay.mobile.security.bio.common.record.MetaRecord;
import com.alipay.mobile.security.bio.utils.StringUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class Upload {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private int f5785a = 10;
    private String b = "2.0";
    private float c = 0.7f;
    private float d = 0.95f;
    private String e = MetaRecord.DEFAULT_LOG_CLASSIFIERS;
    private String[] f;

    public String getLog_classifier() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6ccfb347", new Object[]{this}) : this.e;
    }

    public void setLog_classifier(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3df2d70f", new Object[]{this, str});
        } else {
            this.e = str;
        }
    }

    public String[] getCollection() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("fc58642a", new Object[]{this}) : this.f;
    }

    public void setCollection(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deaf6498", new Object[]{this, strArr});
        } else {
            this.f = strArr;
        }
    }

    public int getMinquality() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1aa90d5d", new Object[]{this})).intValue() : this.f5785a;
    }

    public void setMinquality(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("714fac4d", new Object[]{this, new Integer(i)});
        } else {
            this.f5785a = i;
        }
    }

    public String getMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("24310680", new Object[]{this}) : this.b;
    }

    public void setMode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f66f09f6", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public float getUpload_compress_rate() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2742c04c", new Object[]{this})).floatValue() : this.c;
    }

    public void setUpload_compress_rate(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae20b58", new Object[]{this, new Float(f)});
        } else {
            this.c = f;
        }
    }

    public float getColor_nano_compress_rate() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6b95eb9b", new Object[]{this})).floatValue() : this.d;
    }

    public void setColor_nano_compress_rate(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("696aefe9", new Object[]{this, new Float(f)});
        } else {
            this.d = f;
        }
    }

    public String getLogClassifier() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e5db058a", new Object[]{this}) : this.e;
    }

    public void setLogClassifier(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a258d94", new Object[]{this, str});
        } else {
            this.e = str;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "Upload{minquality=" + this.f5785a + ", mode='" + this.b + "', upload_compress_rate=" + this.c + ", log_classifier='" + this.e + "', collection='" + StringUtil.array2String(this.f) + "'}";
    }
}
