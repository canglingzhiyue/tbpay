package com.taobao.tao.tbmainfragment;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.tbmainfragment.anim.FragmentAnimator;
import com.taobao.tao.util.TBMainLog;
import tb.kge;

/* loaded from: classes.dex */
public abstract class SupportActivity extends AppCompatActivity implements e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "SupportActivity";
    public final f mDelegate = new f(this);

    static {
        kge.a(1177111494);
        kge.a(-697100915);
    }

    public static /* synthetic */ Object ipc$super(SupportActivity supportActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode != -641568046) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onCreate((Bundle) objArr[0]);
            return null;
        }
    }

    public abstract boolean isFragmentSupported(String str, ISupportFragment iSupportFragment);

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        this.mDelegate.a(bundle);
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            super.onDestroy();
        }
    }

    @Override // com.taobao.tao.tbmainfragment.e
    public f getSupportDelegate() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("2408b568", new Object[]{this}) : this.mDelegate;
    }

    @Override // com.taobao.tao.tbmainfragment.e
    public FragmentAnimator getFragmentAnimator() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FragmentAnimator) ipChange.ipc$dispatch("ce8bca08", new Object[]{this}) : this.mDelegate.b();
    }

    public void setFragmentAnimator(FragmentAnimator fragmentAnimator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88a7c6a4", new Object[]{this, fragmentAnimator});
        } else {
            this.mDelegate.a(fragmentAnimator);
        }
    }

    @Override // com.taobao.tao.tbmainfragment.e
    public FragmentAnimator onCreateFragmentAnimator() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FragmentAnimator) ipChange.ipc$dispatch("c5eed56d", new Object[]{this}) : this.mDelegate.c();
    }

    public boolean onSupportKeyDown(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b1ba32f5", new Object[]{this, new Integer(i), keyEvent})).booleanValue() : this.mDelegate.a(i, keyEvent);
    }

    public void loadRootFragment(int i, ISupportFragment iSupportFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69c0c625", new Object[]{this, new Integer(i), iSupportFragment});
        } else {
            this.mDelegate.a(i, iSupportFragment);
        }
    }

    public void loadRootFragment(int i, ISupportFragment iSupportFragment, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcbe2b65", new Object[]{this, new Integer(i), iSupportFragment, new Boolean(z), new Boolean(z2)});
        } else {
            this.mDelegate.a(i, iSupportFragment, z, z2);
        }
    }

    public void start(ISupportFragment iSupportFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e146f0a", new Object[]{this, iSupportFragment});
        } else {
            this.mDelegate.a(iSupportFragment);
        }
    }

    public boolean tryStartFragment(String str, ISupportFragment iSupportFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c22a5b4d", new Object[]{this, str, iSupportFragment})).booleanValue();
        }
        if (!isFragmentSupported(str, iSupportFragment)) {
            TBMainLog.tlog(TAG, "current fragment or url is not support fragment");
            return false;
        }
        this.mDelegate.a(iSupportFragment);
        return true;
    }

    public void start(ISupportFragment iSupportFragment, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4479e539", new Object[]{this, iSupportFragment, new Integer(i)});
        } else {
            this.mDelegate.a(iSupportFragment, i);
        }
    }

    public void start(ISupportFragment iSupportFragment, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ac334ea", new Object[]{this, iSupportFragment, new Integer(i), new Integer(i2)});
        } else {
            this.mDelegate.a(iSupportFragment, i, i2);
        }
    }

    public void startForResult(ISupportFragment iSupportFragment, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e36ebad7", new Object[]{this, iSupportFragment, new Integer(i)});
        } else {
            this.mDelegate.b(iSupportFragment, i);
        }
    }

    public void replaceFragment(ISupportFragment iSupportFragment, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e5cd988", new Object[]{this, iSupportFragment, new Boolean(z)});
        } else {
            this.mDelegate.a(iSupportFragment, z);
        }
    }

    public void pop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e863a658", new Object[]{this});
            return;
        }
        TBMainLog.tlog(TAG, "pop");
        this.mDelegate.d();
    }

    public void popTo(Class<?> cls, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("735cb7aa", new Object[]{this, cls, new Boolean(z)});
        } else {
            this.mDelegate.a(cls, z);
        }
    }
}
