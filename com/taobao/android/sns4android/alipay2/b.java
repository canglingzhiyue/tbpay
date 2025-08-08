package com.taobao.android.sns4android.alipay2;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import android.widget.Toast;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.callback.DataCallback;
import com.ali.user.mobile.coordinator.CoordinatorWrapper;
import com.ali.user.mobile.info.AlipayInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* loaded from: classes6.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else {
            b();
        }
    }

    public static void a(final Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a25ba", new Object[]{activity});
        } else {
            AlipayInfo.getInstance().getApdidToken(new DataCallback<String>() { // from class: com.taobao.android.sns4android.alipay2.b.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.mobile.callback.DataCallback
                public /* synthetic */ void result(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("91402500", new Object[]{this, str});
                    } else {
                        a(str);
                    }
                }

                public void a(final String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                    } else if (!StringUtils.isEmpty(str)) {
                        new CoordinatorWrapper().execute(new AsyncTask<Object, Void, Boolean>() { // from class: com.taobao.android.sns4android.alipay2.b.1.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Boolean, java.lang.Object] */
                            @Override // android.os.AsyncTask
                            public /* synthetic */ Boolean doInBackground(Object[] objArr) {
                                IpChange ipChange3 = $ipChange;
                                return ipChange3 instanceof IpChange ? ipChange3.ipc$dispatch("e83e4786", new Object[]{this, objArr}) : a(objArr);
                            }

                            @Override // android.os.AsyncTask
                            public /* synthetic */ void onPostExecute(Boolean bool) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("b105c779", new Object[]{this, bool});
                                } else {
                                    a(bool);
                                }
                            }

                            public Boolean a(Object... objArr) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    return (Boolean) ipChange3.ipc$dispatch("978dc706", new Object[]{this, objArr});
                                }
                                try {
                                    c.a(activity, DataProviderFactory.getDataProvider().getAlipaySsoDesKey(), str, DataProviderFactory.getDataProvider().getContext().getPackageName(), AlipaySSOResultActivity.class.getName());
                                    return true;
                                } catch (Exception e) {
                                    e.printStackTrace();
                                    return false;
                                }
                            }

                            public void a(Boolean bool) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("ba62f9e5", new Object[]{this, bool});
                                } else if (bool.booleanValue()) {
                                } else {
                                    b.a();
                                }
                            }
                        }, new Object[0]);
                    } else {
                        b.a();
                    }
                }
            });
        }
    }

    private static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
            return;
        }
        try {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.taobao.android.sns4android.alipay2.b.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        Toast.makeText(DataProviderFactory.getApplicationContext(), DataProviderFactory.getApplicationContext().getString(R.string.aliuser_network_error), 0).show();
                    }
                }
            });
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
