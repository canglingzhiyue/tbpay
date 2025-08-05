package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.internal.b;
import java.util.Map;

/* loaded from: classes6.dex */
public class jji extends jjh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1040019048);
    }

    @Override // tb.jjh
    public void a(jiy jiyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef76457e", new Object[]{this, jiyVar});
        }
    }

    @Override // tb.jjh
    public Map<String, String> getExposureViewProperties(String str, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("21fe9e1", new Object[]{this, str, view});
        }
        return null;
    }

    @Override // tb.jjh
    public b getExposureViewTag(String str, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("5d54bfd6", new Object[]{this, str, view});
        }
        return null;
    }

    @Override // tb.jjh
    public boolean isExposureView(String str, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9ec7c8cf", new Object[]{this, str, view})).booleanValue();
        }
        return false;
    }
}
