package mtopsdk.network.impl;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.common.util.HttpHeaderConstant;
import tb.kge;

/* loaded from: classes9.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f25024a = "";
    private String b = "";

    static {
        kge.a(1737024210);
    }

    public static f a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("3bc883e", new Object[]{str});
        }
        f fVar = new f();
        if (TextUtils.isEmpty(str)) {
            return fVar;
        }
        try {
            JSONObject parseObject = JSON.parseObject(str);
            fVar.f25024a = parseObject.getString(HttpHeaderConstant.X_RETCODE);
            fVar.b = parseObject.getString(HttpHeaderConstant.X_BIN_LENGTH);
        } catch (Throwable unused) {
        }
        return fVar;
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f25024a;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.b;
    }
}
