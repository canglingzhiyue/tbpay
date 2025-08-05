package com.taobao.tao.shop.rule;

import android.os.AsyncTask;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.shop.rule.data.TBBundleUrlRuleInfo;
import com.taobao.tao.shop.rule.data.TBUrlRuleResponse;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;
import tb.ouq;
import tb.our;
import tb.ouu;

/* loaded from: classes8.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile f f21096a;
    private final ConcurrentHashMap<String, TBUrlRuleResponse> b = new ConcurrentHashMap<>();
    private final ouq c = our.a();

    public static /* synthetic */ ouq a(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ouq) ipChange.ipc$dispatch("2ec630f0", new Object[]{fVar}) : fVar.c;
    }

    public static /* synthetic */ void a(f fVar, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd0ee0e9", new Object[]{fVar, str, str2, str3});
        } else {
            fVar.b(str, str2, str3);
        }
    }

    public static /* synthetic */ ConcurrentHashMap b(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ConcurrentHashMap) ipChange.ipc$dispatch("9043b11a", new Object[]{fVar}) : fVar.b;
    }

    static {
        kge.a(1530940032);
        f21096a = null;
    }

    private f() {
    }

    public static f a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("ee62f4d1", new Object[0]);
        }
        if (f21096a == null) {
            synchronized (f.class) {
                if (f21096a == null) {
                    f21096a = new f();
                }
            }
        }
        return f21096a;
    }

    public TBUrlRuleResponse a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBUrlRuleResponse) ipChange.ipc$dispatch("7fd7f970", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            ouu.b("bundleName  is  empty");
            return null;
        }
        TBBundleUrlRuleInfo a2 = b.a(str);
        if (a2 == null) {
            ouu.b("not support bundleName=" + str);
            return null;
        }
        TBUrlRuleResponse tBUrlRuleResponse = this.b.get(str);
        if (tBUrlRuleResponse == null) {
            a(a2);
            ouu.b(" TBUrlRuleResponse did not initialized " + str);
            return null;
        }
        g.a(a2.mBundleName, tBUrlRuleResponse.version);
        return tBUrlRuleResponse;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        b.a();
        a(b.a(b.f21093a));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.taobao.tao.shop.rule.f$1] */
    public void a(final TBBundleUrlRuleInfo tBBundleUrlRuleInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d80309bb", new Object[]{this, tBBundleUrlRuleInfo});
        } else if (tBBundleUrlRuleInfo == null) {
            ouu.b(" initRule() -  bundleInfo is null");
        } else {
            new AsyncTask<Object, Object, TBUrlRuleResponse>() { // from class: com.taobao.tao.shop.rule.f.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                    if (str.hashCode() == -1325021319) {
                        super.onPostExecute(objArr[0]);
                        return null;
                    }
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                }

                /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.tao.shop.rule.data.TBUrlRuleResponse, java.lang.Object] */
                @Override // android.os.AsyncTask
                public /* synthetic */ TBUrlRuleResponse doInBackground(Object[] objArr) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("e83e4786", new Object[]{this, objArr}) : a(objArr);
                }

                @Override // android.os.AsyncTask
                public /* synthetic */ void onPostExecute(TBUrlRuleResponse tBUrlRuleResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b105c779", new Object[]{this, tBUrlRuleResponse});
                    } else {
                        a(tBUrlRuleResponse);
                    }
                }

                public TBUrlRuleResponse a(Object... objArr) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (TBUrlRuleResponse) ipChange2.ipc$dispatch("3db6b907", new Object[]{this, objArr});
                    }
                    TBUrlRuleResponse a2 = com.taobao.tao.shop.rule.util.b.a(tBBundleUrlRuleInfo.mBundleName, f.a(f.this).a(tBBundleUrlRuleInfo.mBundleName));
                    if (a2 != null) {
                        return a2;
                    }
                    ouu.b(" initRule() -  load rule from assets ");
                    String a3 = d.a(tBBundleUrlRuleInfo.mRuleFileName);
                    TBUrlRuleResponse a4 = com.taobao.tao.shop.rule.util.b.a(tBBundleUrlRuleInfo.mBundleName, a3);
                    if (a4 != null) {
                        f.a(f.this, tBBundleUrlRuleInfo.mBundleName, a3, a4.version);
                        return a4;
                    }
                    ouu.b(" initRule() -  assets rule not working , wired ");
                    f.a(f.this, tBBundleUrlRuleInfo.mBundleName, "", "");
                    return null;
                }

                public void a(TBUrlRuleResponse tBUrlRuleResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d234426", new Object[]{this, tBUrlRuleResponse});
                        return;
                    }
                    super.onPostExecute(tBUrlRuleResponse);
                    if (tBUrlRuleResponse != null) {
                        f.b(f.this).put(tBBundleUrlRuleInfo.mBundleName, tBUrlRuleResponse);
                        g.a(tBBundleUrlRuleInfo.mBundleName, tBUrlRuleResponse.version);
                        ouu.b(" initRule() -  success ");
                        return;
                    }
                    ouu.b(" initRule() -  both ruleCache and assets not work, impossible ");
                }
            }.execute(new Object[0]);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.taobao.tao.shop.rule.f$2] */
    public void a(final String str, final String str2, final String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            new AsyncTask<Object, Object, TBUrlRuleResponse>() { // from class: com.taobao.tao.shop.rule.f.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass2 anonymousClass2, String str4, Object... objArr) {
                    if (str4.hashCode() == -1325021319) {
                        super.onPostExecute(objArr[0]);
                        return null;
                    }
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str4));
                }

                /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.tao.shop.rule.data.TBUrlRuleResponse, java.lang.Object] */
                @Override // android.os.AsyncTask
                public /* synthetic */ TBUrlRuleResponse doInBackground(Object[] objArr) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("e83e4786", new Object[]{this, objArr}) : a(objArr);
                }

                @Override // android.os.AsyncTask
                public /* synthetic */ void onPostExecute(TBUrlRuleResponse tBUrlRuleResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b105c779", new Object[]{this, tBUrlRuleResponse});
                    } else {
                        a(tBUrlRuleResponse);
                    }
                }

                public TBUrlRuleResponse a(Object... objArr) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (TBUrlRuleResponse) ipChange2.ipc$dispatch("3db6b907", new Object[]{this, objArr});
                    }
                    f.a(f.this, str, str2, str3);
                    return com.taobao.tao.shop.rule.util.b.a(str, str2);
                }

                public void a(TBUrlRuleResponse tBUrlRuleResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d234426", new Object[]{this, tBUrlRuleResponse});
                        return;
                    }
                    super.onPostExecute(tBUrlRuleResponse);
                    if (tBUrlRuleResponse != null) {
                        f.b(f.this).put(str, tBUrlRuleResponse);
                        ouu.b(" refreshRule() -  success ");
                        return;
                    }
                    ouu.b(" refreshRule() -  download rule is not valid  ");
                }
            }.execute(new Object[0]);
        }
    }

    private void b(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3509d07", new Object[]{this, str, str2, str3});
        } else if (this.c.b(str, str2)) {
            this.c.a(str, str3);
        } else {
            ouu.b(" saveToCache() -  saveRuleToFile=false  ");
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        TBUrlRuleResponse tBUrlRuleResponse = this.b.get(str);
        if (tBUrlRuleResponse == null) {
            ouu.b(" TBUrlRuleDataManager.checkRuleNeedUpdate() -  tbUrlRuleResponse == null  ");
        } else {
            g.a(str, tBUrlRuleResponse.version);
        }
    }
}
