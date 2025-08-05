package tb;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tschedule.e;
import com.taobao.android.tschedule.parser.a;

/* loaded from: classes6.dex */
public class jlc extends jku {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int SUB_INDEX = 6;
    public String b;
    public String c;

    static {
        kge.a(-615544333);
    }

    @Override // tb.jku
    public /* synthetic */ Object a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c58f0dc1", new Object[]{this, aVar}) : b(aVar);
    }

    public jlc(String str) {
        this.f29616a = str;
        try {
            String[] split = str.substring(6).split(".");
            if (split.length < 2) {
                return;
            }
            this.b = split[0];
            this.c = split[1];
        } catch (Throwable th) {
            jkq.a(jku.TAG, "parse file expr error", th);
        }
    }

    public static jlc b(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jlc) ipChange.ipc$dispatch("e2617ea7", new Object[]{str, objArr});
        }
        if (TextUtils.isEmpty(str) || !str.startsWith("@file.")) {
            return null;
        }
        return new jlc(str);
    }

    public String b(a aVar) {
        SharedPreferences sharedPreferences;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("72c78bb0", new Object[]{this, aVar});
        }
        try {
            if (!TextUtils.isEmpty(this.b) && !TextUtils.isEmpty(this.c) && (sharedPreferences = e.b().getSharedPreferences(this.b, 0)) != null) {
                return sharedPreferences.getString(this.c, null);
            }
        } catch (Throwable th) {
            jkq.a(jku.TAG, "parseFileValue error", th);
        }
        return null;
    }
}
