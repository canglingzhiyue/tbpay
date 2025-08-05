package com.taobao.android.order.bundle.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.vessel.VesselView;
import com.taobao.vessel.utils.VesselType;
import java.io.File;
import tb.hyn;
import tb.hyo;
import tb.hys;
import tb.jxl;
import tb.kge;
import tb.rgy;

/* loaded from: classes6.dex */
public class TBOrderWeexView extends VesselView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String TAG;
    private long mLoadStartTime;
    private String mMd5;
    private boolean mNeedValidateMd5;
    private a mOnLoadListener;
    private String mPageName;
    private String mUrl;
    private float rectRadius;

    /* loaded from: classes6.dex */
    public interface a {
        public static final int ERROR_DOWNLOAD_FILE_CODE = 2;
        public static final int ERROR_JSBUNDLE_ERROR_CODE = 5;
        public static final int ERROR_READ_FILE_CODE = 4;
        public static final int ERROR_URL_CODE = 1;
        public static final int ERROR_VALIDATE_MD5_CODE = 3;
        public static final int ERROR_VESSEL_LOAD_CODE = 7;
        public static final int ERROR_WEEX_OTHER_CODE = 8;
        public static final int ERROR_WEEX_SYNTAX_CODE = 6;

        void a(String str);

        void a(String str, int i, String str2);

        void a(String str, long j);

        void b(String str);
    }

    public static /* synthetic */ Object ipc$super(TBOrderWeexView tBOrderWeexView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1665133574) {
            super.draw((Canvas) objArr[0]);
            return null;
        } else if (hashCode == -1014233709) {
            super.onLoadFinish((View) objArr[0]);
            return null;
        } else if (hashCode != -748060234) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onLoadError((rgy) objArr[0]);
            return null;
        }
    }

    public static /* synthetic */ String access$000() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7022ea09", new Object[0]) : TAG;
    }

    public static /* synthetic */ a access$100(TBOrderWeexView tBOrderWeexView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("36256ae1", new Object[]{tBOrderWeexView}) : tBOrderWeexView.mOnLoadListener;
    }

    public static /* synthetic */ long access$200(TBOrderWeexView tBOrderWeexView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4907488", new Object[]{tBOrderWeexView})).longValue() : tBOrderWeexView.mLoadStartTime;
    }

    public static /* synthetic */ String access$300(TBOrderWeexView tBOrderWeexView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("936a206b", new Object[]{tBOrderWeexView}) : tBOrderWeexView.mUrl;
    }

    static {
        kge.a(1647818644);
        TAG = TBOrderWeexView.class.getSimpleName();
    }

    public TBOrderWeexView(Context context) {
        this(context, null);
    }

    public TBOrderWeexView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TBOrderWeexView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mNeedValidateMd5 = true;
        this.rectRadius = 12.0f;
        setWillNotDraw(false);
        setDowngradeEnable(false);
        this.rectRadius = hyo.a(getContext(), this.rectRadius);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
            return;
        }
        beforeDraw(canvas);
        super.draw(canvas);
    }

    private void beforeDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6014803b", new Object[]{this, canvas});
            return;
        }
        Rect rect = new Rect(0, 0, canvas.getWidth(), canvas.getHeight());
        Path path = new Path();
        float f = this.rectRadius;
        path.addRoundRect(new RectF(rect.left + 0.0f, rect.top + 0.0f, rect.right - 0.0f, rect.bottom - 0.0f), f, f, Path.Direction.CW);
        canvas.clipPath(path);
    }

    public void setOnLoadListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e15193c0", new Object[]{this, aVar});
        } else {
            this.mOnLoadListener = aVar;
        }
    }

    public void loadCard(String str, final String str2, String str3) {
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e3a64bb", new Object[]{this, str, str2, str3});
            return;
        }
        hyn.a(TAG, "loadCard", "pageName =" + str, "url = " + str2, "md5 = " + str3);
        if (this.mNeedValidateMd5) {
            if (TextUtils.isEmpty(str3)) {
                str3 = "NOT ALLOW EMPTY";
            }
            str4 = str3;
        } else {
            str4 = null;
        }
        final VesselType a2 = com.taobao.vessel.utils.b.a(str2);
        if (a2.equals(VesselType.Web)) {
            a aVar = this.mOnLoadListener;
            if (aVar == null) {
                return;
            }
            aVar.a(str2, 1, null);
            return;
        }
        this.mLoadStartTime = System.currentTimeMillis();
        this.mPageName = str;
        this.mUrl = str2;
        this.mMd5 = str4;
        a aVar2 = this.mOnLoadListener;
        if (aVar2 != null) {
            aVar2.a(str2);
        }
        new jxl(getContext().getApplicationContext(), str, str4, com.taobao.vessel.utils.b.c(str2), new com.taobao.android.weexdownloader.downloader.d() { // from class: com.taobao.android.order.bundle.widget.TBOrderWeexView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.weexdownloader.downloader.d
            public void a(final String str5) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str5});
                    return;
                }
                hyn.a(TBOrderWeexView.access$000(), "WeexDownloader", "onFail", str5, new String[0]);
                TBOrderWeexView.this.post(new Runnable() { // from class: com.taobao.android.order.bundle.widget.TBOrderWeexView.1.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                        } else if (hys.a(TBOrderWeexView.this.getContext())) {
                        } else {
                            int i = "md5CheckFail".equals(str5) ? 3 : 2;
                            if (TBOrderWeexView.access$100(TBOrderWeexView.this) == null) {
                                return;
                            }
                            TBOrderWeexView.access$100(TBOrderWeexView.this).a(str2, i, null);
                        }
                    }
                });
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [com.taobao.android.order.bundle.widget.TBOrderWeexView$1$2] */
            @Override // com.taobao.android.weexdownloader.downloader.d
            public void a(final File file) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8a979fdf", new Object[]{this, file});
                } else if (hys.a(TBOrderWeexView.this.getContext())) {
                } else {
                    hyn.a(TBOrderWeexView.access$000(), "WeexDownloader", "onSuccess", file.getName(), new String[0]);
                    new AsyncTask<Object, Object, String>() { // from class: com.taobao.android.order.bundle.widget.TBOrderWeexView.1.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.lang.String] */
                        @Override // android.os.AsyncTask
                        public /* synthetic */ String doInBackground(Object[] objArr) {
                            IpChange ipChange3 = $ipChange;
                            return ipChange3 instanceof IpChange ? ipChange3.ipc$dispatch("e83e4786", new Object[]{this, objArr}) : a(objArr);
                        }

                        @Override // android.os.AsyncTask
                        public /* synthetic */ void onPostExecute(String str5) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("b105c779", new Object[]{this, str5});
                            } else {
                                a(str5);
                            }
                        }

                        public String a(Object[] objArr) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                return (String) ipChange3.ipc$dispatch("2583e9f7", new Object[]{this, objArr});
                            }
                            String a3 = hys.a(file.getPath());
                            if (a3 == null) {
                                hys.c(file.getPath());
                            }
                            return a3;
                        }

                        public void a(String str5) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("f3a64c32", new Object[]{this, str5});
                            } else if (hys.a(TBOrderWeexView.this.getContext())) {
                            } else {
                                if (str5 == null) {
                                    if (TBOrderWeexView.access$100(TBOrderWeexView.this) == null) {
                                        return;
                                    }
                                    TBOrderWeexView.access$100(TBOrderWeexView.this).a(str2, 4, null);
                                    return;
                                }
                                if (TBOrderWeexView.access$100(TBOrderWeexView.this) != null) {
                                    TBOrderWeexView.access$100(TBOrderWeexView.this).b(str2);
                                }
                                System.currentTimeMillis();
                                TBOrderWeexView.access$200(TBOrderWeexView.this);
                                TBOrderWeexView.this.loadData(a2, str5);
                            }
                        }
                    }.execute(new Object[0]);
                }
            }
        }).a();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    @Override // com.taobao.vessel.VesselView, com.taobao.vessel.base.VesselBaseView, tb.rgu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLoadError(tb.rgy r6) {
        /*
            r5 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.order.bundle.widget.TBOrderWeexView.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            if (r1 == 0) goto L15
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r5
            r2 = 1
            r1[r2] = r6
            java.lang.String r6 = "d36981b6"
            r0.ipc$dispatch(r6, r1)
            return
        L15:
            super.onLoadError(r6)
            r0 = 0
            java.lang.String r1 = r6.b
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != 0) goto L3b
            java.lang.String r1 = r6.b
            java.lang.String r4 = "createInstanceSyntaxError"
            boolean r1 = r1.startsWith(r4)
            if (r1 == 0) goto L2f
            r1 = 5
            goto L3d
        L2f:
            java.lang.String r1 = r6.b
            java.lang.String r4 = "callJSTypeError"
            boolean r1 = r1.startsWith(r4)
            if (r1 == 0) goto L3b
            r1 = 6
            goto L3d
        L3b:
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
        L3d:
            if (r1 != r3) goto L43
            r1 = 8
            java.lang.String r0 = r6.b
        L43:
            com.taobao.android.order.bundle.widget.TBOrderWeexView$a r6 = r5.mOnLoadListener
            if (r6 == 0) goto L4c
            java.lang.String r3 = r5.mUrl
            r6.a(r3, r1, r0)
        L4c:
            java.lang.String r6 = com.taobao.android.order.bundle.widget.TBOrderWeexView.TAG
            java.lang.String[] r1 = new java.lang.String[r2]
            java.lang.String r2 = "onLoadError"
            tb.hyn.a(r6, r2, r0, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.order.bundle.widget.TBOrderWeexView.onLoadError(tb.rgy):void");
    }

    @Override // com.taobao.vessel.VesselView, com.taobao.vessel.base.VesselBaseView, tb.rgu
    public void onLoadFinish(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c38c0593", new Object[]{this, view});
            return;
        }
        super.onLoadFinish(view);
        post(new Runnable() { // from class: com.taobao.android.order.bundle.widget.TBOrderWeexView.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                long currentTimeMillis = System.currentTimeMillis() - TBOrderWeexView.access$200(TBOrderWeexView.this);
                if (TBOrderWeexView.access$100(TBOrderWeexView.this) == null) {
                    return;
                }
                TBOrderWeexView.access$100(TBOrderWeexView.this).a(TBOrderWeexView.access$300(TBOrderWeexView.this), currentTimeMillis);
            }
        });
    }
}
