package com.taobao.live.home.dinamic.ability;

import android.os.AsyncTask;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.dkx;
import tb.dky;
import tb.dkz;
import tb.dla;
import tb.dle;
import tb.dlg;
import tb.dlh;
import tb.dll;
import tb.dln;

/* loaded from: classes7.dex */
public class a extends dlg {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long TBLCDNREQUEST = 7441691612387929517L;

    @Override // tb.dlg
    public dkx a(dlh dlhVar, dle dleVar, dll dllVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dkx) ipChange.ipc$dispatch("1c5b757e", new Object[]{this, dlhVar, dleVar, dllVar});
        }
        JSONObject c = dlhVar == null ? null : dlhVar.c();
        if (c == null) {
            return new dky();
        }
        String string = c.getString("requestUrl");
        String string2 = c.getString("timeout");
        String string3 = c.getString("usePost");
        if (TextUtils.isEmpty(string)) {
            return new dky();
        }
        new b(string, string2, string3, dllVar).execute(new String[0]);
        return new dky();
    }

    /* renamed from: com.taobao.live.home.dinamic.ability.a$a  reason: collision with other inner class name */
    /* loaded from: classes7.dex */
    public static class C0683a implements dln {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.dln
        public /* synthetic */ dlg b(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (dlg) ipChange.ipc$dispatch("1766b262", new Object[]{this, obj}) : a(obj);
        }

        public a a(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("a22bfe05", new Object[]{this, obj}) : new a();
        }
    }

    /* loaded from: classes7.dex */
    public static class b extends AsyncTask<String, Integer, C0684a> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f17728a;
        private String b;
        private String c;
        private dll d;

        /* renamed from: com.taobao.live.home.dinamic.ability.a$b$a  reason: collision with other inner class name */
        /* loaded from: classes7.dex */
        public static class C0684a {

            /* renamed from: a  reason: collision with root package name */
            public int f17729a;
            public JSONObject b;

            private C0684a() {
            }
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            if (str.hashCode() == -1325021319) {
                super.onPostExecute(objArr[0]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        /* JADX WARN: Type inference failed for: r4v4, types: [com.taobao.live.home.dinamic.ability.a$b$a, java.lang.Object] */
        @Override // android.os.AsyncTask
        public /* synthetic */ C0684a doInBackground(String[] strArr) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("e83e4786", new Object[]{this, strArr}) : a(strArr);
        }

        @Override // android.os.AsyncTask
        public /* synthetic */ void onPostExecute(C0684a c0684a) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b105c779", new Object[]{this, c0684a});
            } else {
                a(c0684a);
            }
        }

        public b(String str, String str2, String str3, dll dllVar) {
            this.f17728a = str;
            this.b = str2;
            this.c = str3;
            this.d = dllVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:68:0x00ed  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x00e3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public com.taobao.live.home.dinamic.ability.a.b.C0684a a(java.lang.String... r7) {
            /*
                Method dump skipped, instructions count: 241
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.live.home.dinamic.ability.a.b.a(java.lang.String[]):com.taobao.live.home.dinamic.ability.a$b$a");
        }

        public void a(C0684a c0684a) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1702bb00", new Object[]{this, c0684a});
                return;
            }
            super.onPostExecute(c0684a);
            if (c0684a == null) {
                this.d.callback("failure", new dkz());
            } else if (c0684a.f17729a == 200) {
                this.d.callback("success", new dla(c0684a.b));
            } else {
                this.d.callback("failure", new dkz(c0684a.b));
            }
        }
    }
}
