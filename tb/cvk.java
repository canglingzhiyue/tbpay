package tb;

import com.heytap.mcssdk.constant.MessageConstant;
import com.heytap.msp.push.mode.BaseMode;
import java.util.List;

/* loaded from: classes4.dex */
public class cvk extends BaseMode {

    /* renamed from: a  reason: collision with root package name */
    private String f26552a;
    private String b;
    private String c;
    private String d;
    private int e;
    private String f;
    private int g = -2;
    private String h;

    static {
        kge.a(-1140279722);
    }

    public static <T> String a(List<T> list) {
        StringBuilder sb = new StringBuilder();
        for (T t : list) {
            sb.append(t);
            sb.append("&");
        }
        return sb.toString();
    }

    public int a() {
        return this.e;
    }

    public void a(int i) {
        this.e = i;
    }

    public void a(String str) {
        this.f26552a = str;
    }

    public String b() {
        return this.f;
    }

    public void b(int i) {
        this.g = i;
    }

    public void b(String str) {
        this.b = str;
    }

    public int c() {
        return this.g;
    }

    public void c(String str) {
        this.f = str;
    }

    public void d(String str) {
        this.h = str;
    }

    @Override // com.heytap.msp.push.mode.BaseMode
    public int getType() {
        return MessageConstant.MessageType.MESSAGE_CALL_BACK;
    }

    public String toString() {
        return "CallBackResult{, mRegisterID='" + this.c + "', mSdkVersion='" + this.d + "', mCommand=" + this.e + "', mContent='" + this.f + "', mAppPackage=" + this.h + "', mResponseCode=" + this.g + '}';
    }
}
