package com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.SpannableString;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.context.atmo.bean.StickerConfig;
import com.taobao.taolive.room.utils.o;
import com.taobao.taolive.sdk.model.interact.MedalLevelEntity;
import com.taobao.taolive.sdk.model.message.ChatMessage;
import com.taobao.taolive.sdk.utils.u;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import tb.cgl;
import tb.ffg;
import tb.kge;
import tb.phg;
import tb.plx;
import tb.pmd;
import tb.pnf;

/* loaded from: classes5.dex */
public class b implements Handler.Callback {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f13634a;
    private HandlerThread b;
    private Handler c;
    private com.taobao.alilive.aliliveframework.frame.a d;

    /* loaded from: classes5.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f13635a;
        public int b;
        public String c;
        public String d;

        static {
            kge.a(-553700546);
        }
    }

    /* loaded from: classes5.dex */
    public interface c {
        void a(List<ChatMessage> list, long j);
    }

    static {
        kge.a(2023166218);
        kge.a(-1043440182);
    }

    public b(com.taobao.alilive.aliliveframework.frame.a aVar, Context context) {
        this.d = aVar;
        this.f13634a = context;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.b != null) {
        } else {
            this.b = new HandlerThread("Chat-PreProcess");
            this.b.start();
            this.c = new Handler(this.b.getLooper(), this);
        }
    }

    public void a(List<ChatMessage> list, int i, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b93783a", new Object[]{this, list, new Integer(i), cVar});
        } else {
            a(new C0529b(this.d, this.f13634a, list, i, cVar));
        }
    }

    public void a(String str, int i, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86ebc181", new Object[]{this, str, new Integer(i), cVar});
            return;
        }
        if (TextUtils.isEmpty(str) && cVar != null) {
            cVar.a(null, 0L);
        }
        ArrayList arrayList = new ArrayList();
        ChatMessage chatMessage = new ChatMessage();
        chatMessage.mContent = str;
        arrayList.add(chatMessage);
        a(new C0529b(this.d, this.f13634a, arrayList, i, cVar));
    }

    private void a(C0529b c0529b) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89988d79", new Object[]{this, c0529b});
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = 10086;
        obtain.obj = c0529b;
        this.c.sendMessage(obtain);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        Handler handler = this.c;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        HandlerThread handlerThread = this.b;
        if (handlerThread == null) {
            return;
        }
        handlerThread.quit();
        this.b = null;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
        }
        if (message.what == 10086 && (message.obj instanceof C0529b)) {
            C0529b.a((C0529b) message.obj);
        }
        return true;
    }

    /* renamed from: com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.b$b  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C0529b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f13636a;
        private List<a> b;
        private c c;
        private WeakReference<Context> d;
        private long e;
        private int f;
        private HashMap<String, StickerConfig> g;
        private HashMap<String, StickerConfig> h;
        private String i;
        private String j;
        private String k;
        private List<ChatMessage> l;
        private ChatMessage m;
        private int n = -1;

        static {
            kge.a(-2035635869);
        }

        public static /* synthetic */ void a(C0529b c0529b) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("89988d79", new Object[]{c0529b});
            } else {
                c0529b.a();
            }
        }

        public static /* synthetic */ void a(C0529b c0529b, ChatMessage chatMessage, List list, SpannableString spannableString, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3776d063", new Object[]{c0529b, chatMessage, list, spannableString, new Integer(i), new Integer(i2)});
            } else {
                c0529b.a(chatMessage, list, spannableString, i, i2);
            }
        }

        public static /* synthetic */ void a(C0529b c0529b, List list, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ceca77d9", new Object[]{c0529b, list, new Integer(i)});
            } else {
                c0529b.a(list, i);
            }
        }

        public static /* synthetic */ c b(C0529b c0529b) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("fe68084c", new Object[]{c0529b}) : c0529b.c;
        }

        public static /* synthetic */ List c(C0529b c0529b) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("4760a26c", new Object[]{c0529b}) : c0529b.l;
        }

        public static /* synthetic */ long d(C0529b c0529b) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8c0408f0", new Object[]{c0529b})).longValue() : c0529b.e;
        }

        public static /* synthetic */ int e(C0529b c0529b) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8cd28770", new Object[]{c0529b})).intValue() : c0529b.f;
        }

        public static /* synthetic */ WeakReference f(C0529b c0529b) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (WeakReference) ipChange.ipc$dispatch("7f33a9cc", new Object[]{c0529b}) : c0529b.d;
        }

        public static /* synthetic */ ChatMessage g(C0529b c0529b) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ChatMessage) ipChange.ipc$dispatch("adf8868e", new Object[]{c0529b}) : c0529b.m;
        }

        public static /* synthetic */ String h(C0529b c0529b) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("136251a0", new Object[]{c0529b}) : c0529b.f13636a;
        }

        private void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            this.n++;
            if (this.n >= this.l.size()) {
                Context context = this.d.get();
                if (context == null) {
                    return;
                }
                ((Activity) context).runOnUiThread(new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.b.b.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else if (C0529b.b(C0529b.this) == null) {
                        } else {
                            C0529b.b(C0529b.this).a(C0529b.c(C0529b.this), System.currentTimeMillis() - C0529b.d(C0529b.this));
                        }
                    }
                });
                return;
            }
            ChatMessage chatMessage = this.l.get(this.n);
            if (chatMessage.mType == ChatMessage.MessageType.TXT && !TextUtils.isEmpty(chatMessage.mContent)) {
                this.m = chatMessage;
                this.f13636a = chatMessage.mContent;
                this.i = chatMessage.renders.get("commentType");
                this.j = chatMessage.renders.get("stickerVersion");
                this.k = chatMessage.renders.get("stickerId");
                a(chatMessage);
                return;
            }
            a();
        }

        private List<MedalLevelEntity> a(HashMap<String, String> hashMap) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("2c66969c", new Object[]{this, hashMap});
            }
            if (hashMap == null) {
                return null;
            }
            if (phg.d().a()) {
                str = hashMap.get(ChatMessage.KEY_MEDAL_LIST_DT);
            } else {
                str = hashMap.get(ChatMessage.KEY_MEDAL_LIST_TB);
            }
            if (!TextUtils.isEmpty(str)) {
                return JSON.parseArray(str, MedalLevelEntity.class);
            }
            return null;
        }

        private void a(final ChatMessage chatMessage) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d487357f", new Object[]{this, chatMessage});
                return;
            }
            List<MedalLevelEntity> a2 = a(chatMessage.renders);
            if (a2 != null && !a2.isEmpty()) {
                final int size = a2.size();
                final ArrayList arrayList = new ArrayList();
                for (int i = 0; i < size; i++) {
                    final MedalLevelEntity medalLevelEntity = a2.get(i);
                    final int i2 = i;
                    o.a(medalLevelEntity.medalIcon).a(new pnf() { // from class: com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.b.b.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        /* JADX WARN: Removed duplicated region for block: B:19:0x00ae  */
                        /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
                        @Override // tb.pnf
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public void a(java.lang.Object r12) {
                            /*
                                r11 = this;
                                com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.b.C0529b.AnonymousClass2.$ipChange
                                boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
                                r2 = 2
                                r3 = 0
                                if (r1 == 0) goto L15
                                java.lang.Object[] r1 = new java.lang.Object[r2]
                                r1[r3] = r11
                                r2 = 1
                                r1[r2] = r12
                                java.lang.String r12 = "a6251244"
                                r0.ipc$dispatch(r12, r1)
                                return
                            L15:
                                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                                r0.<init>()
                                java.lang.String r1 = "generateMedalList url:"
                                r0.append(r1)
                                com.taobao.taolive.sdk.model.interact.MedalLevelEntity r1 = r2
                                java.lang.String r1 = r1.medalIcon
                                r0.append(r1)
                                java.lang.String r0 = r0.toString()
                                java.lang.String r1 = "ChatPreProcessor3"
                                tb.plx.a(r1, r0)
                                android.graphics.drawable.BitmapDrawable r12 = (android.graphics.drawable.BitmapDrawable) r12
                                com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.b$b r0 = com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.b.C0529b.this
                                int r0 = com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.b.C0529b.e(r0)
                                int r1 = r12.getIntrinsicWidth()
                                int r0 = r0 * r1
                                int r1 = r12.getIntrinsicHeight()
                                int r0 = r0 / r1
                                com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.b$b r1 = com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.b.C0529b.this
                                int r1 = com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.b.C0529b.e(r1)
                                r12.setBounds(r3, r3, r0, r1)
                                r0 = 0
                                com.taobao.taolive.sdk.model.interact.MedalLevelEntity r1 = r2
                                int r1 = r1.type
                                r4 = 17
                                if (r1 != r2) goto L92
                                boolean r1 = tb.hgs.r()
                                if (r1 == 0) goto Lab
                                com.taobao.taolive.sdk.model.interact.MedalLevelEntity r1 = r2
                                java.lang.String r1 = r1.text
                                boolean r1 = android.text.TextUtils.isEmpty(r1)
                                if (r1 != 0) goto Lab
                                com.taobao.taolive.sdk.model.interact.MedalLevelEntity r0 = r2
                                java.lang.String r0 = r0.text
                                int r1 = r0.length()
                                r2 = 3
                                if (r1 <= r2) goto L73
                                java.lang.String r0 = r0.substring(r3, r2)
                            L73:
                                android.text.SpannableString r1 = new android.text.SpannableString
                                r1.<init>(r0)
                                com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.k r2 = new com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.k
                                com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.b$b r5 = com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.b.C0529b.this
                                java.lang.ref.WeakReference r5 = com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.b.C0529b.f(r5)
                                java.lang.Object r5 = r5.get()
                                android.content.Context r5 = (android.content.Context) r5
                                r2.<init>(r5, r12, r0)
                                int r12 = r0.length()
                                r1.setSpan(r2, r3, r12, r4)
                                r8 = r1
                                goto Lac
                            L92:
                                android.text.SpannableString r0 = new android.text.SpannableString
                                com.taobao.taolive.sdk.model.interact.MedalLevelEntity r1 = r2
                                java.lang.String r1 = r1.medalType
                                r0.<init>(r1)
                                com.taobao.taolive.room.ui.chat.view.c r1 = new com.taobao.taolive.room.ui.chat.view.c
                                r1.<init>(r12)
                                com.taobao.taolive.sdk.model.interact.MedalLevelEntity r12 = r2
                                java.lang.String r12 = r12.medalType
                                int r12 = r12.length()
                                r0.setSpan(r1, r3, r12, r4)
                            Lab:
                                r8 = r0
                            Lac:
                                if (r8 == 0) goto Lbb
                                com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.b$b r5 = com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.b.C0529b.this
                                com.taobao.taolive.sdk.model.message.ChatMessage r6 = r3
                                java.util.List r7 = r4
                                int r9 = r5
                                int r10 = r6
                                com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.b.C0529b.a(r5, r6, r7, r8, r9, r10)
                            Lbb:
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.b.C0529b.AnonymousClass2.a(java.lang.Object):void");
                        }

                        @Override // tb.pnf
                        public void b(Object obj) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("f056ab85", new Object[]{this, obj});
                                return;
                            }
                            plx.b("ChatPreProcessor3", "generateMedalList error url:" + medalLevelEntity.medalIcon);
                            C0529b.a(C0529b.this, chatMessage, arrayList, new SpannableString(medalLevelEntity.medalType), i2, size);
                        }
                    }).a();
                }
                return;
            }
            b();
        }

        /* renamed from: com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.b$b$a */
        /* loaded from: classes5.dex */
        public static class a implements Comparable<a> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public int f13641a;
            public SpannableString b;

            static {
                kge.a(1690367204);
                kge.a(415966670);
            }

            private a() {
            }

            @Override // java.lang.Comparable
            public /* synthetic */ int compareTo(a aVar) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6a4672d6", new Object[]{this, aVar})).intValue() : a(aVar);
            }

            public int a(a aVar) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("84800b4f", new Object[]{this, aVar})).intValue() : this.f13641a - aVar.f13641a;
            }
        }

        private void a(ChatMessage chatMessage, List<a> list, SpannableString spannableString, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("12bd3b92", new Object[]{this, chatMessage, list, spannableString, new Integer(i), new Integer(i2)});
                return;
            }
            a aVar = new a();
            aVar.b = spannableString;
            aVar.f13641a = i;
            list.add(aVar);
            if (list.size() != i2) {
                return;
            }
            plx.b("ChatPreProcessor3", "medal download finish");
            Collections.sort(list);
            ArrayList arrayList = new ArrayList();
            for (a aVar2 : list) {
                arrayList.add(aVar2.b);
            }
            chatMessage.mCommentIcons = arrayList;
            b();
        }

        private void a(final List<SpannableString> list, final int i) {
            IpChange ipChange = $ipChange;
            int i2 = 0;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("19a074ca", new Object[]{this, list, new Integer(i)});
            } else if (i >= this.b.size()) {
                int i3 = i - 1;
                if (this.b.get(i3).b < this.f13636a.length()) {
                    list.add(new SpannableString(this.f13636a.substring(this.b.get(i3).b)));
                }
                a();
            } else {
                final a aVar = this.b.get(i);
                if (aVar.f13635a > 0) {
                    String str = this.f13636a;
                    if (i != 0) {
                        i2 = this.b.get(i - 1).b;
                    }
                    list.add(new SpannableString(str.substring(i2, aVar.f13635a)));
                }
                com.alilive.adapter.uikit.d b = cgl.b();
                if (b != null) {
                    pmd.a().l().a(b.a(aVar.d)).a(new pnf() { // from class: com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.b.b.3
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // tb.pnf
                        public void a(Object obj) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("a6251244", new Object[]{this, obj});
                                return;
                            }
                            if (((Context) C0529b.f(C0529b.this).get()) != null) {
                                plx.a("ChatPreProcessor3", "generateStickerByIndex url:" + aVar.d);
                                BitmapDrawable bitmapDrawable = (BitmapDrawable) obj;
                                bitmapDrawable.setBounds(0, 0, (C0529b.e(C0529b.this) * bitmapDrawable.getIntrinsicWidth()) / bitmapDrawable.getIntrinsicHeight(), C0529b.e(C0529b.this));
                                SpannableString spannableString = new SpannableString(aVar.c);
                                spannableString.setSpan(new com.taobao.taolive.room.ui.chat.view.c(bitmapDrawable), 0, aVar.c.length(), 17);
                                list.add(spannableString);
                            }
                            C0529b.a(C0529b.this, list, i + 1);
                        }

                        @Override // tb.pnf
                        public void b(Object obj) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("f056ab85", new Object[]{this, obj});
                                return;
                            }
                            plx.b("ChatPreProcessor3", "generateStickerByIndex error url:" + aVar.d);
                            list.add(new SpannableString(aVar.c));
                            C0529b.a(C0529b.this, list, i + 1);
                        }
                    }).a();
                    return;
                }
                list.add(new SpannableString(aVar.c));
                a(list, i + 1);
            }
        }

        public C0529b(com.taobao.alilive.aliliveframework.frame.a aVar, Context context, List<ChatMessage> list, int i, c cVar) {
            this.d = new WeakReference<>(context);
            this.l = list;
            this.c = cVar;
            this.f = i;
            if (aVar != null && (aVar.I() instanceof ffg)) {
                ffg ffgVar = (ffg) aVar.I();
                this.g = ffgVar.c();
                this.h = ffgVar.d();
            }
            this.e = System.currentTimeMillis();
        }

        private void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            } else if (!u.G()) {
                a();
            } else if ("anchor_custom_sticker".equals(this.i) && !TextUtils.equals("2", this.j)) {
                c();
            } else {
                this.b = new ArrayList();
                int i = 0;
                int i2 = -1;
                for (int i3 = 0; i3 < this.f13636a.length(); i3++) {
                    char charAt = this.f13636a.charAt(i3);
                    if ('[' == charAt) {
                        i2 = i3;
                    } else if (']' == charAt && i2 >= 0) {
                        int i4 = i3 + 1;
                        String substring = this.f13636a.substring(i2, i4);
                        HashMap<String, StickerConfig> hashMap = this.g;
                        if (hashMap != null && hashMap.containsKey(substring)) {
                            i++;
                            a aVar = new a();
                            aVar.f13635a = i2;
                            aVar.b = i4;
                            aVar.c = substring;
                            StickerConfig stickerConfig = this.g.get(substring);
                            if (stickerConfig != null) {
                                aVar.d = stickerConfig.thumbnail;
                            }
                            this.b.add(aVar);
                        }
                        i2 = -1;
                    }
                }
                if (i > 0) {
                    this.m.mSpannableContent = new ArrayList();
                    a(this.m.mSpannableContent, 0);
                    return;
                }
                a();
            }
        }

        private void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
                return;
            }
            final StickerConfig stickerConfig = this.h.get(this.k);
            if (stickerConfig != null) {
                pmd.a().l().a(cgl.b().a(stickerConfig.thumbnail)).a(new pnf() { // from class: com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.b.b.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.pnf
                    public void a(Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("a6251244", new Object[]{this, obj});
                            return;
                        }
                        C0529b.g(C0529b.this).mSpannableContent = new ArrayList();
                        BitmapDrawable bitmapDrawable = (BitmapDrawable) obj;
                        bitmapDrawable.setBounds(0, 0, (C0529b.e(C0529b.this) * bitmapDrawable.getIntrinsicWidth()) / bitmapDrawable.getIntrinsicHeight(), C0529b.e(C0529b.this));
                        SpannableString spannableString = new SpannableString(C0529b.h(C0529b.this));
                        plx.a("ChatPreProcessor3", "generateStickerByIndex url:" + stickerConfig.thumbnail);
                        spannableString.setSpan(new com.taobao.taolive.room.ui.chat.view.c(bitmapDrawable), 0, C0529b.h(C0529b.this).length(), 17);
                        C0529b.g(C0529b.this).mSpannableContent.add(spannableString);
                        C0529b.a(C0529b.this);
                    }

                    @Override // tb.pnf
                    public void b(Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("f056ab85", new Object[]{this, obj});
                            return;
                        }
                        C0529b.g(C0529b.this).mSpannableContent = new ArrayList();
                        C0529b.g(C0529b.this).mSpannableContent.add(new SpannableString(C0529b.h(C0529b.this)));
                        C0529b.a(C0529b.this);
                    }
                }).a();
                return;
            }
            this.m.mSpannableContent = new ArrayList();
            this.m.mSpannableContent.add(new SpannableString(this.f13636a));
            a();
        }
    }
}
