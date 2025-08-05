package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.sdk.editor.data.RichLabel;
import com.taobao.android.litecreator.sdk.editor.y;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public class hee extends hdz<List<RichLabel>> implements y {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1558228677);
        kge.a(1514436225);
    }

    public static /* synthetic */ Object ipc$super(hee heeVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.litecreator.sdk.editor.y
    public void a(RichLabel richLabel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("673856db", new Object[]{this, richLabel});
            return;
        }
        q();
        List<RichLabel> a2 = a();
        a2.add(richLabel.mo940clone());
        g().a(a2);
    }

    @Override // com.taobao.android.litecreator.sdk.editor.y
    public void a(RichLabel richLabel, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fd2f788", new Object[]{this, richLabel, new Integer(i)});
            return;
        }
        List<RichLabel> a2 = t().a();
        if (a2 == null || i < 0 || a2.size() <= 0 || a2.size() <= i) {
            return;
        }
        q();
        a2.remove(i);
        a2.add(i, richLabel.mo940clone());
        g().a(a2);
    }

    @Override // com.taobao.android.litecreator.sdk.editor.y
    public List<RichLabel> e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("fd625b", new Object[]{this}) : t().a();
    }

    @Override // com.taobao.android.litecreator.sdk.editor.y
    public void b(RichLabel richLabel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ac7db1c", new Object[]{this, richLabel});
            return;
        }
        List<RichLabel> a2 = t().a();
        if (a2 == null || a2.size() <= 0) {
            return;
        }
        q();
        a2.remove(richLabel);
        g().a(a2);
    }

    private List<RichLabel> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("627608df", new Object[]{this});
        }
        List<RichLabel> a2 = t().a();
        return a2 == null ? new ArrayList() : a2;
    }
}
