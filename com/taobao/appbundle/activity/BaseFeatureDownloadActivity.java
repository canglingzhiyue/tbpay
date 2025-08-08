package com.taobao.appbundle.activity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.alibaba.android.split.a;
import com.alibaba.android.split.core.splitinstall.g;
import com.alibaba.android.split.core.splitinstall.j;
import com.alibaba.android.split.core.splitinstall.m;
import com.alibaba.android.split.core.splitinstall.o;
import com.alibaba.android.split.core.tasks.d;
import com.alibaba.android.split.core.tasks.e;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.appbundle.c;
import com.taobao.appbundle.runtime.InjectClassLoader;
import com.taobao.appbundle.runtime.ModuleDependencyUtils;
import com.taobao.tao.BaseActivity;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;
import tb.bgu;
import tb.kge;

/* loaded from: classes6.dex */
public abstract class BaseFeatureDownloadActivity extends BaseActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String b;
    public Intent e;
    public int f;
    private int i;
    private boolean j;

    /* renamed from: a  reason: collision with root package name */
    public g f16284a = c.Companion.a().c();
    private bgu h = (bgu) a.b(bgu.class, "BaseFeatureDownloadActivity");
    public long c = 0;
    public List<String> d = new ArrayList();
    public o g = new o() { // from class: com.taobao.appbundle.activity.BaseFeatureDownloadActivity.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.alibaba.android.split.core.listener.b
        public /* synthetic */ void onStateUpdate(m mVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bd17bbbe", new Object[]{this, mVar});
            } else {
                a(mVar);
            }
        }

        public void a(m mVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("398f1780", new Object[]{this, mVar});
            } else if (!mVar.g().contains(BaseFeatureDownloadActivity.this.b)) {
            } else {
                int b = mVar.b();
                if (b == 2) {
                    BaseFeatureDownloadActivity.this.c(mVar);
                } else if (b == 3) {
                    BaseFeatureDownloadActivity.this.b();
                } else if (b == 4) {
                    BaseFeatureDownloadActivity.this.b(mVar);
                } else if (b == 5) {
                    BaseFeatureDownloadActivity.this.d();
                } else if (b == 6) {
                    BaseFeatureDownloadActivity.this.a(mVar);
                } else if (b != 10) {
                } else {
                    BaseFeatureDownloadActivity.this.a();
                }
            }
        }
    };

    static {
        kge.a(833418043);
    }

    public static /* synthetic */ Object ipc$super(BaseFeatureDownloadActivity baseFeatureDownloadActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            case 1264052993:
                super.onNewIntent((Intent) objArr[0]);
                return null;
            case 1281559479:
                super.onRestart();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public abstract void a();

    public abstract void a(m mVar);

    public abstract void a(Exception exc);

    public abstract void b();

    public abstract void b(m mVar);

    public abstract void c();

    public abstract void c(m mVar);

    public static /* synthetic */ int a(BaseFeatureDownloadActivity baseFeatureDownloadActivity, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1b47beb8", new Object[]{baseFeatureDownloadActivity, new Integer(i)})).intValue();
        }
        baseFeatureDownloadActivity.i = i;
        return i;
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        setResult(this.f, intent);
        Log.e("FeatureDownloadActivity", "onActivityResult");
        finish();
    }

    @Override // com.taobao.tao.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        setTheme(R.style.Theme_DownLoadActivity);
        super.onCreate(null);
        Bundle extras = getIntent().getExtras();
        this.b = (String) extras.get("feature_name");
        if (StringUtils.isEmpty(this.b) && Build.VERSION.SDK_INT < 28) {
            this.b = InjectClassLoader.Companion.getFeatureName();
        }
        this.d = ModuleDependencyUtils.getDependencies(this.b);
        this.e = (Intent) extras.getParcelable("orignal_intent");
        this.f = extras.getInt("request_code");
        String str = this.b;
        Intent intent = this.e;
        com.taobao.appbundle.remote.a.a(str, intent == null ? "" : intent.getDataString());
        this.c = System.currentTimeMillis();
        bgu bguVar = this.h;
        bguVar.c("show loading view:" + this.b, new Object[0]);
    }

    @Override // android.app.Activity
    public void onRestart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c630bb7", new Object[]{this});
            return;
        }
        super.onRestart();
        if (!this.f16284a.a().contains(this.b)) {
            return;
        }
        finish();
    }

    @Override // com.taobao.tao.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        this.f16284a.a(this.g);
        b(this.b);
    }

    @Override // com.taobao.tao.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        this.f16284a.b(this.g);
        this.c = 0L;
        super.onPause();
    }

    @Override // com.taobao.tao.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
        } else {
            super.onNewIntent(intent);
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (this.f16284a.a().contains(str) && this.f16284a.a().containsAll(this.d)) {
            this.c = System.currentTimeMillis();
            d();
        } else {
            j.a a2 = j.a().a(str);
            for (String str2 : this.d) {
                a2.a(str2);
            }
            this.f16284a.a(a2.a()).a(new e<Integer>() { // from class: com.taobao.appbundle.activity.BaseFeatureDownloadActivity.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alibaba.android.split.core.tasks.e
                public /* synthetic */ void onSuccess(Integer num) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ea580ec7", new Object[]{this, num});
                    } else {
                        a(num);
                    }
                }

                public void a(Integer num) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6cdec50f", new Object[]{this, num});
                        return;
                    }
                    BaseFeatureDownloadActivity.a(BaseFeatureDownloadActivity.this, num.intValue());
                    BaseFeatureDownloadActivity.this.c();
                }
            }).a(new d() { // from class: com.taobao.appbundle.activity.BaseFeatureDownloadActivity.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alibaba.android.split.core.tasks.d
                public void onFailure(Exception exc) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ebfde814", new Object[]{this, exc});
                    } else {
                        BaseFeatureDownloadActivity.this.a(exc);
                    }
                }
            });
            String str3 = this.b;
            Intent intent = this.e;
            com.taobao.appbundle.remote.a.a(str3, intent == null ? "" : intent.getDataString());
            this.c = System.currentTimeMillis();
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (this.j) {
        } else {
            Intent intent = this.e;
            if (intent != null) {
                com.taobao.appbundle.remote.a.a(this.b, intent.getDataString(), System.currentTimeMillis() - this.c);
                int i = this.f;
                if (i > 0) {
                    startActivityForResult(this.e, i);
                } else if ((this.e.getFlags() & 268435456) != 0) {
                    this.e.setFlags(0);
                    startActivity(this.e);
                } else {
                    startActivity(this.e);
                    finish();
                }
            } else if ((getIntent().getFlags() & 268435456) != 0) {
                getIntent().setFlags(0);
                startActivity(getIntent());
            } else {
                startActivity(getIntent());
                finish();
            }
            this.j = true;
        }
    }
}
