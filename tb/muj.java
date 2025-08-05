package tb;

import android.util.Log;
import android.widget.Toast;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.base.Versions;
import com.taobao.mytaobao.base.d;
import com.taobao.mytaobao.basement.BasementConstants;
import com.taobao.mytaobao.ut.c;
import com.taobao.tao.Globals;
import com.taobao.tao.navigation.h;

/* loaded from: classes7.dex */
public class muj implements h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final d f31270a;

    static {
        kge.a(-1607855171);
        kge.a(1904646234);
    }

    @Override // com.taobao.tao.navigation.h
    public void onCurrentTabLongClicked() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79eae8f7", new Object[]{this});
        }
    }

    @Override // com.taobao.tao.navigation.h
    public void onNavigationTabMessageChanged(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fd5f3e0", new Object[]{this, str});
        }
    }

    public muj(d dVar) {
        this.f31270a = dVar;
    }

    @Override // com.taobao.tao.navigation.h
    public void onCurrentTabClicked() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f77f6793", new Object[]{this});
            return;
        }
        Log.e("dswdsw", "!!!!!!invoke onCurrentTabClicked");
        this.f31270a.a(BasementConstants.BEHAVIOR_MTB_TAB_TAP, true);
        c.a("Page_MyTaobao", "Page_MyTaobao_click-maintab", "a2141.7631743.1102.1", (String) null, (JSONObject) null);
    }

    @Override // com.taobao.tao.navigation.h
    public void onCurrentTabDoubleTap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c22ad2be", new Object[]{this});
            return;
        }
        if (Versions.isDebug()) {
            Globals.getApplication().getSharedPreferences("equityAnimation", 0).edit().clear().apply();
            Toast.makeText(Globals.getApplication(), "测试清数字翻转疲劳度", 0).show();
        }
        this.f31270a.a(BasementConstants.BEHAVIOR_MTB_TAB_DOUBLE_TAP, true);
        c.a("Page_MyTaobao", "Page_MyTaobao_click-maintab", "a2141.7631743.1102.1", (String) null, (JSONObject) null);
    }
}
