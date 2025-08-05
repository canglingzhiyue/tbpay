package tb;

import android.content.Context;
import android.os.Bundle;
import com.opos.process.bridge.annotation.IBridgeTargetIdentify;
import com.opos.process.bridge.provider.BridgeBizException;
import com.opos.process.bridge.provider.BridgeDispatchException;
import com.opos.process.bridge.provider.BridgeExecuteException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes4.dex */
public abstract class dbj {

    /* renamed from: a  reason: collision with root package name */
    public Context f26657a;
    public Bundle b;
    public IBridgeTargetIdentify c;
    public final List<dbo> d = new ArrayList();
    public List<dbr> e = new ArrayList();
    public final ReentrantLock f = new ReentrantLock(true);
    public int g = 5000;

    static {
        kge.a(-1833965432);
    }

    public void a(Context context, String str, IBridgeTargetIdentify iBridgeTargetIdentify, int i, Object... objArr) {
        String str2 = "call --- targetClass:" + str + ", methodId:" + i;
        b(context, str, iBridgeTargetIdentify, i, objArr);
    }

    public Object b(Context context, String str, IBridgeTargetIdentify iBridgeTargetIdentify, int i, Object... objArr) {
        Bundle c = c(context, str, iBridgeTargetIdentify, i, objArr);
        String str2 = "callRemote --- resultBundle:" + c;
        if (c != null) {
            c.setClassLoader(getClass().getClassLoader());
            int i2 = c.getInt("resultCode");
            if (i2 == 0) {
                return c.get("resultData");
            }
            String string = c.getString("resultMsg");
            String str3 = "error code:" + i2 + ", message:" + string;
            if (i2 == 101008) {
                String str4 = "code:" + i2;
                throw new BridgeExecuteException((Exception) c.getSerializable("resultException"), i2);
            } else if (i2 < 102000) {
                throw new BridgeExecuteException(string, i2);
            } else {
                if (i2 < 103000) {
                    throw new BridgeDispatchException(string, i2);
                }
                if (i2 != 103000) {
                    throw new BridgeExecuteException(string, i2);
                }
                int i3 = c.getInt("interceptorCode");
                String str5 = "interceptor error code:" + i2 + ", message:" + string;
                throw new BridgeBizException(c.getString("interceptorMsg"), i3);
            }
        }
        throw new BridgeExecuteException("remote response is NULL", 102004);
    }

    public abstract Bundle c(Context context, String str, IBridgeTargetIdentify iBridgeTargetIdentify, int i, Object... objArr);
}
