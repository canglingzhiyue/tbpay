package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.sdk.editor.ae;
import com.taobao.android.litecreator.sdk.editor.data.TemplateInfo;

/* loaded from: classes5.dex */
public class hei extends hdz<TemplateInfo> implements ae {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1780217765);
        kge.a(-1716550265);
    }

    @Override // com.taobao.android.litecreator.sdk.editor.ae
    public TemplateInfo o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TemplateInfo) ipChange.ipc$dispatch("57c804e3", new Object[]{this}) : g().a().a();
    }

    @Override // com.taobao.android.litecreator.sdk.editor.ae
    public void P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47cdcd7", new Object[]{this});
            return;
        }
        q();
        g().a(null);
    }

    @Override // com.taobao.android.litecreator.sdk.editor.ae
    public void a(TemplateInfo templateInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8899f15", new Object[]{this, templateInfo});
            return;
        }
        q();
        g().a(templateInfo.mo940clone());
    }
}
