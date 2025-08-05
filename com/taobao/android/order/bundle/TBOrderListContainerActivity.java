package com.taobao.android.order.bundle;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.util.SystemBarDecorator;
import com.taobao.taobao.R;
import com.taobao.uikit.actionbar.ITBPublicMenu;
import com.taobao.uikit.actionbar.TBPublicMenu;
import tb.hyh;
import tb.hyi;
import tb.kge;

/* loaded from: classes6.dex */
public class TBOrderListContainerActivity extends AppCompatActivity implements ITBPublicMenu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private TBOrderListFragment f14519a;

    static {
        kge.a(-1592209717);
        kge.a(-1343974867);
    }

    public static /* synthetic */ Object ipc$super(TBOrderListContainerActivity tBOrderListContainerActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -884160602) {
            if (hashCode != -641568046) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            super.onCreate((Bundle) objArr[0]);
            return null;
        }
        return new Boolean(super.onKeyDown(((Number) objArr[0]).intValue(), (KeyEvent) objArr[1]));
    }

    @Override // com.taobao.uikit.actionbar.ITBPublicMenu
    public Bundle pageUserInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("65615653", new Object[]{this});
        }
        return null;
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.order_list_container);
        a(4473924);
        this.f14519a = new TBOrderListFragment();
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("originActivityIntent", getIntent());
        this.f14519a.setArguments(bundle2);
        getSupportFragmentManager().beginTransaction().add(R.id.ol_fragment_container, this.f14519a).commit();
    }

    private void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        SystemBarDecorator systemBarDecorator = new SystemBarDecorator(this);
        if (hyh.a(hyi.a(this, i))) {
            systemBarDecorator.enableImmersiveStatusBar(true);
        } else {
            systemBarDecorator.enableImmersiveStatusBar();
        }
    }

    @Override // android.support.v7.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        TBOrderListFragment tBOrderListFragment = this.f14519a;
        if (tBOrderListFragment != null && tBOrderListFragment.onKeyDown(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // com.taobao.uikit.actionbar.ITBPublicMenu
    public TBPublicMenu getPublicMenu() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBPublicMenu) ipChange.ipc$dispatch("1f3d234e", new Object[]{this}) : this.f14519a.getPublicMenu();
    }
}
