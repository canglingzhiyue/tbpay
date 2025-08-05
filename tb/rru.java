package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import zoloz.ap.com.toolkit.ui.TitleBar;

/* loaded from: classes9.dex */
public class rru extends rrs {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private TitleBar b;

    static {
        kge.a(-1549812843);
    }

    public static /* synthetic */ Object ipc$super(rru rruVar, String str, Object... objArr) {
        if (str.hashCode() == 90991720) {
            super.a();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.rrs
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        }
    }

    public rru(View view) {
        super(view);
        this.b = (TitleBar) view;
    }

    @Override // tb.rrs
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            super.a();
        }
    }

    @Override // tb.rrs
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        TitleBar titleBar = this.b;
        titleBar.setText(titleBar.getResources().getString(R.string.zdoc_title));
    }
}
