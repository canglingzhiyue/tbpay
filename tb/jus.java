package tb;

import com.taobao.android.weex.WeexInstance;
import com.taobao.android.weex.WeexValue;
import com.taobao.android.weex_framework.bridge.MUSThreadStrategy;

/* loaded from: classes6.dex */
public interface jus<T> {
    MUSThreadStrategy a();

    Object a(WeexInstance weexInstance, T t, WeexValue[] weexValueArr) throws Exception;
}
