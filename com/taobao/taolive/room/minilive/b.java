package com.taobao.taolive.room.minilive;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.comments.chat.ChatTopMessage;
import com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.a;
import com.taobao.taobao.R;
import com.taobao.taolive.room.business.trivial.TrivialQueryResponseData;
import com.taobao.taolive.sdk.model.common.ConventionItem;
import com.taobao.taolive.sdk.model.common.FandomInfo;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.model.message.ChatMessage;
import java.util.ArrayList;
import java.util.Map;
import tb.kge;

/* loaded from: classes8.dex */
public class b implements a.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f21642a;
    private a.InterfaceC0528a b;
    private RecyclerView d;
    private a f;
    private View g;
    private com.taobao.alilive.aliliveframework.frame.a h;
    private boolean c = false;
    private int e = 0;

    static {
        kge.a(-41898388);
        kge.a(312290305);
        kge.a(1109046077);
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.a.b
    public void a(int i, ChatTopMessage chatTopMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92c90558", new Object[]{this, new Integer(i), chatTopMessage});
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.a.b
    public void a(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d36ff2b7", new Object[]{this, new Integer(i), obj});
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.a.b
    public void a(TrivialQueryResponseData trivialQueryResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4755569a", new Object[]{this, trivialQueryResponseData});
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.a.b
    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.a.b
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.a.b
    public void b(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f056ab85", new Object[]{this, obj});
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.a.b
    public void c(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a8844c6", new Object[]{this, obj});
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.a.b
    public void d(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84b9de07", new Object[]{this, obj});
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.a.b
    public void e(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceeb7748", new Object[]{this, obj});
        }
    }

    public b(Context context, com.taobao.alilive.aliliveframework.frame.a aVar) {
        this.f21642a = context;
        this.h = aVar;
        this.b = new com.taobao.taolive.room.ui.chat.view.b(context, aVar, this, null, false, true);
        this.b.h();
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        a.InterfaceC0528a interfaceC0528a = this.b;
        if (interfaceC0528a == null) {
            return;
        }
        interfaceC0528a.g();
        this.b = null;
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        this.b = new com.taobao.taolive.room.ui.chat.view.b(this.f21642a, this.h, this, null, false, true);
        this.b.h();
    }

    public View a(ViewStub viewStub) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("95c5841e", new Object[]{this, viewStub});
        }
        if (viewStub != null) {
            viewStub.setLayoutResource(R.layout.taolive_minilive_message_layout);
            this.g = viewStub.inflate();
            i();
        }
        return this.g;
    }

    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
            return;
        }
        this.g = view;
        i();
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        View view = this.g;
        if (view == null) {
            return;
        }
        this.d = (RecyclerView) view;
        this.f = new a(this.f21642a);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f21642a);
        linearLayoutManager.setStackFromEnd(true);
        linearLayoutManager.setOrientation(1);
        this.d.setLayoutManager(linearLayoutManager);
        this.d.setAdapter(this.f);
        this.c = true;
    }

    public void f() {
        a.InterfaceC0528a interfaceC0528a;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (!this.c || (interfaceC0528a = this.b) == null) {
        } else {
            interfaceC0528a.f();
        }
    }

    public void g() {
        a.InterfaceC0528a interfaceC0528a;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else if (!this.c || (interfaceC0528a = this.b) == null) {
        } else {
            interfaceC0528a.e();
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        a.InterfaceC0528a interfaceC0528a = this.b;
        if (interfaceC0528a == null) {
            return;
        }
        interfaceC0528a.g();
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.a.b
    public void a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
            return;
        }
        ArrayList<ConventionItem> arrayList = null;
        String str = "";
        if (obj instanceof VideoInfo) {
            VideoInfo videoInfo = (VideoInfo) obj;
            if (videoInfo.conventionList != null && videoInfo.conventionList.size() > 0) {
                arrayList = videoInfo.conventionList;
            }
        } else if (obj instanceof FandomInfo) {
            FandomInfo fandomInfo = (FandomInfo) obj;
            if (fandomInfo.conventionList != null && fandomInfo.conventionList.size() > 0) {
                arrayList = fandomInfo.conventionList;
            }
            if (fandomInfo.broadCaster != null) {
                str = fandomInfo.broadCaster.headImg;
            }
        }
        if (arrayList == null) {
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            ConventionItem conventionItem = arrayList.get(i);
            if (!TextUtils.isEmpty(conventionItem.content) && !TextUtils.isEmpty(conventionItem.mockNick)) {
                ChatMessage createConventionMessage = ChatTopMessage.createConventionMessage(conventionItem.mockNick, conventionItem.content, R.color.taolive_chat_color2);
                createConventionMessage.isAnchor = true;
                if (!TextUtils.isEmpty(str)) {
                    createConventionMessage.mUserIcon = str;
                }
                c(createConventionMessage);
            }
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.a.b
    public void a(ArrayList<ChatMessage> arrayList) {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfaf7e42", new Object[]{this, arrayList});
            return;
        }
        ArrayList<ChatMessage> arrayList2 = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).mType != ChatMessage.MessageType.FOLLOW) {
                arrayList2.add(arrayList.get(i));
            }
        }
        if (arrayList2.size() <= 0 || (aVar = this.f) == null) {
            return;
        }
        aVar.a(arrayList2);
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.a.b
    public void c(ChatMessage chatMessage) {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("272fe001", new Object[]{this, chatMessage});
        } else if (!this.c || !chatMessage.isOnScreen || (aVar = this.f) == null) {
        } else {
            aVar.a(chatMessage);
            if (this.e != 0) {
                return;
            }
            ((LinearLayoutManager) this.d.getLayoutManager()).scrollToPositionWithOffset(this.f.getItemCount() - 1, 0);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.a.b
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        f();
        View view = this.g;
        if (view == null) {
            return;
        }
        view.setVisibility(8);
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.a.b
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        g();
        View view = this.g;
        if (view == null) {
            return;
        }
        view.setVisibility(0);
    }
}
