package com.taobao.taolive.room.ui.chat.view;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.os.AsyncTask;
import android.text.SpannableString;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alilive.adapter.uikit.d;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.proxy.f;
import com.taobao.taolive.room.utils.v;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.model.message.ChatMessage;
import com.taobao.taolive.sdk.utils.u;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import tb.cgl;
import tb.kge;
import tb.pmd;
import tb.pnf;
import tb.pqj;

/* loaded from: classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f21694a;
    private b b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes8.dex */
    public interface c {
        void a(ArrayList<ChatMessage> arrayList, long j);
    }

    static {
        kge.a(1130576127);
    }

    /* renamed from: com.taobao.taolive.room.ui.chat.view.a$a  reason: collision with other inner class name */
    /* loaded from: classes8.dex */
    public static class C0902a {

        /* renamed from: a  reason: collision with root package name */
        public int f21695a;
        public int b;
        public String c;
        public String d;

        static {
            kge.a(-253383437);
        }

        private C0902a() {
        }
    }

    /* loaded from: classes8.dex */
    public static class b extends AsyncTask<Void, Void, Void> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f21696a;
        private List<C0902a> b;
        private c c;
        private WeakReference<Context> d;
        private long e;
        private int f;
        private HashMap<String, JSONObject> g;
        private HashMap<String, JSONObject> h;
        private HashMap<Integer, String> i;
        private int j;
        private String k;
        private String l;
        private List<VideoInfo.CommentIcon> m;
        private ArrayList<ChatMessage> n;
        private ChatMessage o;
        private int p = -1;

        static {
            kge.a(-1511437490);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public static /* synthetic */ c a(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("96bb8b4d", new Object[]{bVar}) : bVar.c;
        }

        public static /* synthetic */ void a(b bVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3ef9a1bd", new Object[]{bVar, new Integer(i)});
            } else {
                bVar.a(i);
            }
        }

        public static /* synthetic */ void a(b bVar, List list, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("12bfeec", new Object[]{bVar, list, new Integer(i)});
            } else {
                bVar.a(list, i);
            }
        }

        public static /* synthetic */ ArrayList b(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("ae2e32a1", new Object[]{bVar}) : bVar.n;
        }

        public static /* synthetic */ long c(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("711d5e7c", new Object[]{bVar})).longValue() : bVar.e;
        }

        public static /* synthetic */ WeakReference d(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (WeakReference) ipChange.ipc$dispatch("7ffb5a17", new Object[]{bVar}) : bVar.d;
        }

        public static /* synthetic */ int e(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c11aafd", new Object[]{bVar})).intValue() : bVar.f;
        }

        public static /* synthetic */ ChatMessage f(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ChatMessage) ipChange.ipc$dispatch("e6de1b42", new Object[]{bVar}) : bVar.o;
        }

        public static /* synthetic */ void g(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4705f78c", new Object[]{bVar});
            } else {
                bVar.e();
            }
        }

        public static /* synthetic */ String h(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c298a73", new Object[]{bVar}) : bVar.f21696a;
        }

        public static /* synthetic */ void i(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("31fa440e", new Object[]{bVar});
            } else {
                bVar.a();
            }
        }

        /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Void, java.lang.Object] */
        @Override // android.os.AsyncTask
        public /* synthetic */ Void doInBackground(Void[] voidArr) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("e83e4786", new Object[]{this, voidArr}) : a(voidArr);
        }

        private void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            this.p++;
            if (this.p >= this.n.size()) {
                Context context = this.d.get();
                if (context == null) {
                    return;
                }
                ((Activity) context).runOnUiThread(new Runnable() { // from class: com.taobao.taolive.room.ui.chat.view.a.b.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else if (b.a(b.this) == null) {
                        } else {
                            b.a(b.this).a(b.b(b.this), System.currentTimeMillis() - b.c(b.this));
                        }
                    }
                });
                return;
            }
            ChatMessage chatMessage = this.n.get(this.p);
            if (chatMessage.mType == ChatMessage.MessageType.TXT && !TextUtils.isEmpty(chatMessage.mContent)) {
                this.o = chatMessage;
                this.f21696a = chatMessage.mContent;
                this.j = v.b(chatMessage.renders.get(com.taobao.taolive.room.ui.fanslevel.a.FANS_LEVEL_RENDER));
                this.k = chatMessage.renders.get("commentType");
                this.l = chatMessage.renders.get("stickerId");
                this.m = pqj.b(chatMessage.renders.get("comment_icons"), VideoInfo.CommentIcon.class);
                b();
                return;
            }
            a();
        }

        private void a(final List<SpannableString> list, final int i) {
            IpChange ipChange = $ipChange;
            int i2 = 0;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("19a074ca", new Object[]{this, list, new Integer(i)});
            } else if (i >= this.b.size()) {
                int i3 = i - 1;
                if (this.b.get(i3).b < this.f21696a.length()) {
                    list.add(new SpannableString(this.f21696a.substring(this.b.get(i3).b)));
                }
                a();
            } else {
                final C0902a c0902a = this.b.get(i);
                if (c0902a.f21695a > 0) {
                    String str = this.f21696a;
                    if (i != 0) {
                        i2 = this.b.get(i - 1).b;
                    }
                    list.add(new SpannableString(str.substring(i2, c0902a.f21695a)));
                }
                d b = cgl.b();
                if (b != null) {
                    pmd.a().l().a(b.a(c0902a.d)).a(new pnf() { // from class: com.taobao.taolive.room.ui.chat.view.a.b.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // tb.pnf
                        public void a(Object obj) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("a6251244", new Object[]{this, obj});
                                return;
                            }
                            if (((Context) b.d(b.this).get()) != null) {
                                BitmapDrawable bitmapDrawable = (BitmapDrawable) obj;
                                bitmapDrawable.setBounds(0, 0, (b.e(b.this) * bitmapDrawable.getIntrinsicWidth()) / bitmapDrawable.getIntrinsicHeight(), b.e(b.this));
                                SpannableString spannableString = new SpannableString(c0902a.c);
                                spannableString.setSpan(new com.taobao.taolive.room.ui.chat.view.c(bitmapDrawable), 0, c0902a.c.length(), 17);
                                list.add(spannableString);
                            }
                            b.a(b.this, list, i + 1);
                        }

                        @Override // tb.pnf
                        public void b(Object obj) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("f056ab85", new Object[]{this, obj});
                                return;
                            }
                            list.add(new SpannableString(c0902a.c));
                            b.a(b.this, list, i + 1);
                        }
                    }).a();
                    return;
                }
                list.add(new SpannableString(c0902a.c));
                a(list, i + 1);
            }
        }

        public b(Context context, com.taobao.alilive.aliliveframework.frame.a aVar, ArrayList<ChatMessage> arrayList, int i, c cVar) {
            this.d = new WeakReference<>(context);
            this.n = arrayList;
            this.c = cVar;
            this.f = i;
            this.g = f.f().atmosphereInstanceGetStickerKeyMatchMap(aVar);
            this.h = f.f().atmosphereInstanceGetStickerIdMatchMap(aVar);
            this.i = f.f().atmosphereInstanceGetFansLightMap(aVar);
        }

        public Void a(Void... voidArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Void) ipChange.ipc$dispatch("54f0ab29", new Object[]{this, voidArr});
            }
            this.e = System.currentTimeMillis();
            a();
            return null;
        }

        private void a(final int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            } else if (i >= this.m.size()) {
                c();
            } else {
                final VideoInfo.CommentIcon commentIcon = this.m.get(i);
                pmd.a().l().a(commentIcon.icon).a(new pnf() { // from class: com.taobao.taolive.room.ui.chat.view.a.b.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.pnf
                    public void a(Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("a6251244", new Object[]{this, obj});
                            return;
                        }
                        if (!TextUtils.isEmpty(commentIcon.name)) {
                            BitmapDrawable bitmapDrawable = (BitmapDrawable) obj;
                            bitmapDrawable.setBounds(0, 0, (b.e(b.this) * bitmapDrawable.getIntrinsicWidth()) / bitmapDrawable.getIntrinsicHeight(), b.e(b.this));
                            SpannableString spannableString = new SpannableString(commentIcon.name);
                            spannableString.setSpan(new com.taobao.taolive.room.ui.chat.view.c(bitmapDrawable), 0, commentIcon.name.length(), 17);
                            b.f(b.this).mCommentIcons.add(spannableString);
                        }
                        b.a(b.this, i + 1);
                    }

                    @Override // tb.pnf
                    public void b(Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("f056ab85", new Object[]{this, obj});
                        } else {
                            b.a(b.this, i + 1);
                        }
                    }
                }).a();
            }
        }

        private void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                return;
            }
            List<VideoInfo.CommentIcon> list = this.m;
            if (list != null && !list.isEmpty()) {
                this.o.mCommentIcons = new ArrayList();
                a(0);
                return;
            }
            c();
        }

        private void c() {
            HashMap<Integer, String> hashMap;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            } else if (u.H() && (hashMap = this.i) != null && hashMap.containsKey(Integer.valueOf(this.j))) {
                pmd.a().l().a(this.i.get(Integer.valueOf(this.j))).a(new pnf() { // from class: com.taobao.taolive.room.ui.chat.view.a.b.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.pnf
                    public void a(Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("a6251244", new Object[]{this, obj});
                            return;
                        }
                        BitmapDrawable bitmapDrawable = (BitmapDrawable) obj;
                        bitmapDrawable.setBounds(0, 0, (b.e(b.this) * bitmapDrawable.getIntrinsicWidth()) / bitmapDrawable.getIntrinsicHeight(), b.e(b.this));
                        b.f(b.this).mFansLight = new SpannableString("[fansLight]");
                        b.f(b.this).mFansLight.setSpan(new com.taobao.taolive.room.ui.chat.view.c(bitmapDrawable), 0, 11, 17);
                        b.g(b.this);
                    }

                    @Override // tb.pnf
                    public void b(Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("f056ab85", new Object[]{this, obj});
                        } else {
                            b.g(b.this);
                        }
                    }
                }).a();
            } else {
                e();
            }
        }

        private void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("596b2eb", new Object[]{this});
                return;
            }
            JSONObject jSONObject = this.h.get(this.l);
            if (jSONObject != null) {
                pmd.a().l().a(cgl.b().a(jSONObject.getString("thumbnail"))).a(new pnf() { // from class: com.taobao.taolive.room.ui.chat.view.a.b.5
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.pnf
                    public void a(Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("a6251244", new Object[]{this, obj});
                            return;
                        }
                        b.f(b.this).mSpannableContent = new ArrayList();
                        BitmapDrawable bitmapDrawable = (BitmapDrawable) obj;
                        bitmapDrawable.setBounds(0, 0, (b.e(b.this) * bitmapDrawable.getIntrinsicWidth()) / bitmapDrawable.getIntrinsicHeight(), b.e(b.this));
                        SpannableString spannableString = new SpannableString(b.h(b.this));
                        spannableString.setSpan(new com.taobao.taolive.room.ui.chat.view.c(bitmapDrawable), 0, b.h(b.this).length(), 17);
                        b.f(b.this).mSpannableContent.add(spannableString);
                        b.i(b.this);
                    }

                    @Override // tb.pnf
                    public void b(Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("f056ab85", new Object[]{this, obj});
                            return;
                        }
                        b.f(b.this).mSpannableContent = new ArrayList();
                        b.f(b.this).mSpannableContent.add(new SpannableString(b.h(b.this)));
                        b.i(b.this);
                    }
                }).a();
                return;
            }
            this.o.mSpannableContent = new ArrayList();
            this.o.mSpannableContent.add(new SpannableString(this.f21696a));
            a();
        }

        private void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            } else if (!u.G()) {
                a();
            } else if ("anchor_custom_sticker".equals(this.k)) {
                d();
            } else {
                this.b = new ArrayList();
                int i = 0;
                int i2 = -1;
                for (int i3 = 0; i3 < this.f21696a.length(); i3++) {
                    char charAt = this.f21696a.charAt(i3);
                    if ('[' == charAt) {
                        i2 = i3;
                    } else if (']' == charAt && i2 >= 0) {
                        int i4 = i3 + 1;
                        String substring = this.f21696a.substring(i2, i4);
                        if (this.g.containsKey(substring)) {
                            i++;
                            C0902a c0902a = new C0902a();
                            c0902a.f21695a = i2;
                            c0902a.b = i4;
                            c0902a.c = substring;
                            if (this.g.get(substring) != null) {
                                c0902a.d = this.g.get(substring).getString("thumbnail");
                            }
                            this.b.add(c0902a);
                        }
                        i2 = -1;
                    }
                }
                if (i > 0) {
                    this.o.mSpannableContent = new ArrayList();
                    a(this.o.mSpannableContent, 0);
                    return;
                }
                a();
            }
        }
    }

    public a(Context context) {
        this.f21694a = context;
    }

    public void a(com.taobao.alilive.aliliveframework.frame.a aVar, ArrayList<ChatMessage> arrayList, int i, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("535fe8b3", new Object[]{this, aVar, arrayList, new Integer(i), cVar});
            return;
        }
        this.b = new b(this.f21694a, aVar, arrayList, i, cVar);
        this.b.execute(new Void[0]);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        b bVar = this.b;
        if (bVar == null) {
            return;
        }
        bVar.cancel(true);
    }
}
