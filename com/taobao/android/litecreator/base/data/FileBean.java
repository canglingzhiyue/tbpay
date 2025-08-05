package com.taobao.android.litecreator.base.data;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.util.an;
import com.taobao.android.litecreator.util.k;
import com.taobao.android.litecreator.util.s;
import com.taobao.android.litecreator.util.u;
import java.io.File;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes5.dex */
public class FileBean implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "FileBean";
    public static final int TYPE_MEDIA_STORE = 1;
    public static final int TYPE_MEDIA_STORE_CAN_READ = 2;
    public static final int TYPE_SANDBOX = 0;
    public int id;
    public String mimeType;
    public String path;
    public int type = 0;
    public String uri;

    static {
        kge.a(1710354167);
        kge.a(1028243835);
    }

    public String getFileSuffix() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("183306f6", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.mimeType)) {
            return com.taobao.tao.log.utils.a.LOG_SUFFIX_DATA;
        }
        try {
            return "." + this.mimeType.split("/")[1];
        } catch (Throwable unused) {
            return com.taobao.tao.log.utils.a.LOG_SUFFIX_DATA;
        }
    }

    public Uri uri() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("758372a", new Object[]{this});
        }
        if (!TextUtils.isEmpty(this.uri)) {
            return Uri.parse(this.uri);
        }
        return null;
    }

    public boolean copyToSandBox(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b449418", new Object[]{this, context, str})).booleanValue();
        }
        if (this.type == 0) {
            return true;
        }
        String b = an.b(String.valueOf(this.id), "");
        if (k.a(b)) {
            u.b(TAG, "copyToSandBox. cache exist! skip copy! file : " + b);
            this.path = b;
            this.type = 0;
            return true;
        } else if (s.A() && k.a(this.path) && new File(this.path).canRead()) {
            this.type = 2;
            u.d(TAG, "copyToSandBox.file can read, no need copy again!");
            return true;
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            if (!k.b(context, uri(), str) && !k.a(context, uri(), str)) {
                u.d(TAG, "copyToSandBox. copy file failed!");
                return false;
            }
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            u.d(TAG, "copyToSandBox. copy file success! cost=" + currentTimeMillis2 + "ms, file : " + str);
            this.path = str;
            this.type = 0;
            an.a(String.valueOf(this.id), this.path);
            return true;
        }
    }

    public boolean isSandBoxFile() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("45e3e144", new Object[]{this})).booleanValue() : this.type == 0;
    }
}
