package android.taobao.windvane.jsbridge.api;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.provider.ContactsContract;
import android.support.v4.app.ActivityCompat;
import android.taobao.windvane.config.j;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.i;
import android.taobao.windvane.jsbridge.r;
import android.taobao.windvane.runtimepermission.b;
import android.taobao.windvane.thread.WVThreadPool;
import android.taobao.windvane.util.m;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.runtimepermission.api.TBRunTimePermission;
import java.util.List;
import org.json.JSONException;
import tb.aem;
import tb.kge;

/* loaded from: classes2.dex */
public class WVContacts extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String KEY_NAME = "name";
    private static final String KEY_PHONE = "phone";
    private static final String[] PHONES_PROJECTION;
    public static final String RATIONAL_STR = "方便发现更多通讯录好友，与好友分享、互动、参与活动、购买宝贝和充值话费";
    private static final String TAG = "WVContacts";
    public static final String TITLE_STR = "“淘宝”想要访问你的通讯录";
    private WVCallBackContext mCallback = null;

    public static /* synthetic */ Object ipc$super(WVContacts wVContacts, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void access$000(WVContacts wVContacts, WVCallBackContext wVCallBackContext, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf5b673c", new Object[]{wVContacts, wVCallBackContext, new Integer(i)});
        } else {
            wVContacts.choose(wVCallBackContext, i);
        }
    }

    public static /* synthetic */ void access$100(WVContacts wVContacts, String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32ee0a90", new Object[]{wVContacts, str, wVCallBackContext});
        } else {
            wVContacts.find(str, wVCallBackContext);
        }
    }

    public static /* synthetic */ void access$200(WVContacts wVContacts, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f42d0365", new Object[]{wVContacts, wVCallBackContext});
        } else {
            wVContacts.authStatus(wVCallBackContext);
        }
    }

    public static /* synthetic */ Context access$300(WVContacts wVContacts) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("6c2dacff", new Object[]{wVContacts}) : wVContacts.mContext;
    }

    static {
        kge.a(-378223424);
        PHONES_PROJECTION = new String[]{"display_name", "data1"};
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, final String str2, final WVCallBackContext wVCallBackContext) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if ("choose".equals(str)) {
            Boolean bool = null;
            try {
                bool = JSONObject.parseObject(str2).getBoolean(TBRunTimePermission.REQUEST_PERMISSION_API_NAME);
            } catch (Exception unused) {
            }
            if (bool != null && !bool.equals(true)) {
                choose(wVCallBackContext, 4004);
            }
            requestPermissionAndRun(wVCallBackContext, new Runnable() { // from class: android.taobao.windvane.jsbridge.api.WVContacts.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        WVContacts.access$000(WVContacts.this, wVCallBackContext, 4003);
                    }
                }
            });
        } else if (com.taobao.android.weex_framework.util.a.ATOM_EXT_find.equals(str)) {
            requestPermissionAndRun(wVCallBackContext, new Runnable() { // from class: android.taobao.windvane.jsbridge.api.WVContacts.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        WVContacts.access$100(WVContacts.this, str2, wVCallBackContext);
                    }
                }
            });
        } else if (!"authStatus".equals(str)) {
            return false;
        } else {
            try {
                z = new org.json.JSONObject(str2).optBoolean("autoAskAuth", true);
            } catch (JSONException unused2) {
                m.e(TAG, "authStatus when parse params to JSON error, params=" + str2);
                z = true;
            }
            if (!z) {
                authStatus(wVCallBackContext);
            } else {
                try {
                    Runnable runnable = new Runnable() { // from class: android.taobao.windvane.jsbridge.api.WVContacts.3
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                WVContacts.access$200(WVContacts.this, wVCallBackContext);
                            }
                        }
                    };
                    if (j.commonConfig.aD && Build.VERSION.SDK_INT >= 27) {
                        if (ActivityCompat.checkSelfPermission(this.mContext, "android.permission.READ_CONTACTS") == 0) {
                            authStatus(wVCallBackContext);
                        } else {
                            requestPermissionAndRun(wVCallBackContext, runnable, runnable);
                        }
                    } else {
                        requestPermissionAndRun(wVCallBackContext, runnable, runnable);
                    }
                } catch (Exception e) {
                    m.e(TAG, "authStatus :");
                    e.printStackTrace();
                }
            }
            aem.a().a(3014);
            return true;
        }
        aem.a().a(3014);
        return true;
    }

    private void requestPermissionAndRun(WVCallBackContext wVCallBackContext, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e81c454", new Object[]{this, wVCallBackContext, runnable});
        } else {
            requestPermissionAndRun(wVCallBackContext, runnable, new i(wVCallBackContext, "NO_PERMISSION"));
        }
    }

    private void requestPermissionAndRun(WVCallBackContext wVCallBackContext, final Runnable runnable, Runnable runnable2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48973cd2", new Object[]{this, wVCallBackContext, runnable, runnable2});
            return;
        }
        b.a b = android.taobao.windvane.runtimepermission.b.a(this.mContext, new String[]{"android.permission.READ_CONTACTS"}).a(new Runnable() { // from class: android.taobao.windvane.jsbridge.api.WVContacts.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    WVThreadPool.getInstance().execute(runnable);
                }
            }
        }).b(runnable2);
        j.a();
        if (j.commonConfig.bm) {
            b.a(TITLE_STR).b(RATIONAL_STR);
        }
        b.b();
    }

    private void choose(WVCallBackContext wVCallBackContext, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8b1308", new Object[]{this, wVCallBackContext, new Integer(i)});
            return;
        }
        this.mCallback = wVCallBackContext;
        Intent intent = new Intent("android.intent.action.PICK", ContactsContract.CommonDataKinds.Phone.CONTENT_URI);
        if (!(this.mContext instanceof Activity)) {
            return;
        }
        try {
            ((Activity) this.mContext).startActivityForResult(intent, i);
        } catch (Exception e) {
            m.e(TAG, "open pick activity fail, " + e.getMessage());
            wVCallBackContext.error();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void find(java.lang.String r9, android.taobao.windvane.jsbridge.WVCallBackContext r10) {
        /*
            r8 = this;
            java.lang.String r0 = "phone"
            java.lang.String r1 = "name"
            java.lang.String r2 = "WVContacts"
            com.android.alibaba.ip.runtime.IpChange r3 = android.taobao.windvane.jsbridge.api.WVContacts.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L1e
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r8
            r1 = 1
            r0[r1] = r9
            r9 = 2
            r0[r9] = r10
            java.lang.String r9 = "1af6c5c7"
            r3.ipc$dispatch(r9, r0)
            return
        L1e:
            r3 = 0
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: org.json.JSONException -> L38
            r4.<init>(r9)     // Catch: org.json.JSONException -> L38
            java.lang.String r5 = "filter"
            org.json.JSONObject r4 = r4.optJSONObject(r5)     // Catch: org.json.JSONException -> L38
            if (r4 == 0) goto L35
            java.lang.String r5 = r4.optString(r1)     // Catch: org.json.JSONException -> L38
            java.lang.String r9 = r4.optString(r0)     // Catch: org.json.JSONException -> L39
            goto L4e
        L35:
            r9 = r3
            r5 = r9
            goto L4e
        L38:
            r5 = r3
        L39:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "find contacts when parse params to JSON error, params="
            r4.append(r6)
            r4.append(r9)
            java.lang.String r9 = r4.toString()
            android.taobao.windvane.util.m.e(r2, r9)
            r9 = r3
        L4e:
            java.util.List r9 = r8.getPhoneContacts(r3, r5, r9)
            if (r9 != 0) goto L62
            java.lang.String r9 = "find contacts failed"
            android.taobao.windvane.util.m.d(r2, r9)
            android.taobao.windvane.jsbridge.r r9 = new android.taobao.windvane.jsbridge.r
            r9.<init>()
            r10.error(r9)
            return
        L62:
            android.taobao.windvane.jsbridge.r r3 = new android.taobao.windvane.jsbridge.r
            r3.<init>()
            org.json.JSONArray r4 = new org.json.JSONArray
            r4.<init>()
            java.util.Iterator r9 = r9.iterator()     // Catch: org.json.JSONException -> L8f
        L70:
            boolean r5 = r9.hasNext()     // Catch: org.json.JSONException -> L8f
            if (r5 == 0) goto La8
            java.lang.Object r5 = r9.next()     // Catch: org.json.JSONException -> L8f
            android.taobao.windvane.jsbridge.api.WVContacts$a r5 = (android.taobao.windvane.jsbridge.api.WVContacts.a) r5     // Catch: org.json.JSONException -> L8f
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: org.json.JSONException -> L8f
            r6.<init>()     // Catch: org.json.JSONException -> L8f
            java.lang.String r7 = r5.f1643a     // Catch: org.json.JSONException -> L8f
            r6.put(r1, r7)     // Catch: org.json.JSONException -> L8f
            java.lang.String r5 = r5.b     // Catch: org.json.JSONException -> L8f
            r6.put(r0, r5)     // Catch: org.json.JSONException -> L8f
            r4.put(r6)     // Catch: org.json.JSONException -> L8f
            goto L70
        L8f:
            r9 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "put contacts error, "
            r0.append(r1)
            java.lang.String r9 = r9.getMessage()
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            android.taobao.windvane.util.m.e(r2, r9)
        La8:
            java.lang.String r9 = "contacts"
            r3.a(r9, r4)
            r10.success(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.taobao.windvane.jsbridge.api.WVContacts.find(java.lang.String, android.taobao.windvane.jsbridge.WVCallBackContext):void");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.taobao.windvane.jsbridge.api.WVContacts$5] */
    private void authStatus(final WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38fdcbfe", new Object[]{this, wVCallBackContext});
        } else {
            new AsyncTask<Void, Integer, Void>() { // from class: android.taobao.windvane.jsbridge.api.WVContacts.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Void, java.lang.Object] */
                @Override // android.os.AsyncTask
                public /* synthetic */ Void doInBackground(Void[] voidArr) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("e83e4786", new Object[]{this, voidArr}) : a(voidArr);
                }

                public Void a(Void... voidArr) {
                    Cursor cursor;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (Void) ipChange2.ipc$dispatch("54f0ab29", new Object[]{this, voidArr});
                    }
                    r rVar = new r();
                    try {
                        cursor = WVContacts.access$300(WVContacts.this).getContentResolver().query(Uri.parse("content://com.android.contacts/contacts"), new String[]{"_id"}, null, null, null);
                    } catch (Exception unused) {
                        cursor = null;
                    }
                    if (cursor == null) {
                        rVar.a("isAuthed", "0");
                    } else {
                        rVar.a("isAuthed", "1");
                    }
                    wVCallBackContext.success(rVar);
                    if (cursor != null) {
                        try {
                            cursor.close();
                        } catch (Exception unused2) {
                        }
                    }
                    return null;
                }
            }.execute(new Void[0]);
        }
    }

    @Override // android.taobao.windvane.jsbridge.e
    public void onActivityResult(int i, int i2, Intent intent) {
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        WVCallBackContext wVCallBackContext = this.mCallback;
        Cursor cursor = null;
        if (i != 4004 || wVCallBackContext == null) {
            if (i != 4003 || this.mCallback == null) {
                return;
            }
            if (i2 == -1) {
                if (intent == null || (data = intent.getData()) == null) {
                    m.d(TAG, "contact data is null");
                    return;
                }
                String lastPathSegment = data.getLastPathSegment();
                if (!TextUtils.isEmpty(lastPathSegment)) {
                    List<a> phoneContacts = getPhoneContacts(lastPathSegment, null, null);
                    if (phoneContacts == null || phoneContacts.isEmpty()) {
                        m.d(TAG, "contact result is empty");
                        this.mCallback.error(new r());
                        return;
                    }
                    a aVar = phoneContacts.get(0);
                    if (!TextUtils.isEmpty(aVar.b)) {
                        r rVar = new r();
                        rVar.a("name", aVar.f1643a);
                        rVar.a("phone", aVar.b);
                        this.mCallback.success(rVar);
                        return;
                    }
                }
            }
            if (m.a()) {
                m.b(TAG, "choose contact failed");
            }
            this.mCallback.error(new r());
        } else if (i2 == -1 && intent != null) {
            try {
                Cursor query = this.mContext.getContentResolver().query(intent.getData(), null, null, null, null);
                if (query != null && query.getCount() > 0) {
                    query.moveToFirst();
                    String string = query.getString(query.getColumnIndex("data1"));
                    String string2 = query.getString(query.getColumnIndex("display_name"));
                    r rVar2 = new r();
                    rVar2.a("name", string2);
                    rVar2.a("phone", string);
                    wVCallBackContext.success(rVar2);
                    return;
                }
                wVCallBackContext.error(new r("HY_NO_PERMISSION"));
            } catch (Exception e) {
                if (0 != 0) {
                    try {
                        cursor.close();
                    } catch (Exception unused) {
                    }
                }
                r rVar3 = new r();
                rVar3.a("msg", "exception: " + e.getMessage());
                wVCallBackContext.error(rVar3);
            }
        } else {
            r rVar4 = new r();
            rVar4.a("msg", "denied by the user");
            wVCallBackContext.error(rVar4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x018b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00fc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.util.List<android.taobao.windvane.jsbridge.api.WVContacts.a> getPhoneContacts(java.lang.String r17, java.lang.String r18, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.taobao.windvane.jsbridge.api.WVContacts.getPhoneContacts(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    /* loaded from: classes2.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        public String f1643a;
        public String b;

        static {
            kge.a(159611626);
        }

        private a() {
        }
    }
}
