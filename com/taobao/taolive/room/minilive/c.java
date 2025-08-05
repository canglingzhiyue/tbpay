package com.taobao.taolive.room.minilive;

import android.content.Context;
import android.os.Message;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.alibaba.fastjson.JSON;
import com.alilive.adapter.uikit.AliUrlImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.taolive.room.utils.aa;
import com.taobao.taolive.room.utils.e;
import com.taobao.taolive.room.utils.t;
import com.taobao.taolive.sdk.model.common.LiveItem;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.model.d;
import com.taobao.taolive.sdk.model.f;
import com.taobao.taolive.sdk.model.message.MessageTypeFilter;
import com.taobao.taolive.sdk.model.message.ShareGoodsListMessage;
import com.taobao.taolive.sdk.model.message.TLiveMsg;
import com.taobao.taolive.sdk.utils.j;
import java.util.ArrayList;
import java.util.List;
import tb.kge;
import tb.poy;

/* loaded from: classes8.dex */
public class c implements com.taobao.taolive.sdk.model.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private View f21643a;
    private AliUrlImageView b;
    private TextView c;
    private TextView d;
    private TextView e;
    private View f;
    private Context g;
    private com.taobao.alilive.aliliveframework.frame.a i;
    private f h = new f(this);
    private d.a j = new d.a() { // from class: com.taobao.taolive.room.minilive.c.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.taolive.sdk.core.c
        public void onMessageReceived(int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5b152aef", new Object[]{this, new Integer(i), obj});
            } else if (i == 10092 || i == 10091) {
                ShareGoodsListMessage shareGoodsListMessage = obj instanceof TLiveMsg ? (ShareGoodsListMessage) JSON.parseObject(new String(((TLiveMsg) obj).data), ShareGoodsListMessage.class) : (ShareGoodsListMessage) obj;
                if (shareGoodsListMessage == null || shareGoodsListMessage.goodsList == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (int i2 = 0; i2 < shareGoodsListMessage.goodsList.length; i2++) {
                    LiveItem a2 = j.a(shareGoodsListMessage.goodsList[i2]);
                    if (a2 != null) {
                        a2.goodsIndex = shareGoodsListMessage.goodsIndex;
                        a2.groupNum = shareGoodsListMessage.goodsIndex;
                    }
                    arrayList.add(a2);
                }
                c.a(c.this, arrayList);
            }
        }
    };

    static {
        kge.a(-1597842248);
        kge.a(-1905361424);
    }

    public static /* synthetic */ boolean a(c cVar, List list) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("95790475", new Object[]{cVar, list})).booleanValue() : cVar.a(list);
    }

    public c(Context context, com.taobao.alilive.aliliveframework.frame.a aVar) {
        this.g = context;
        this.i = aVar;
    }

    public View a(ViewStub viewStub) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("95c5841e", new Object[]{this, viewStub});
        }
        if (viewStub != null) {
            viewStub.setLayoutResource(R.layout.taolive_minilive_showcase);
            this.f21643a = viewStub.inflate();
            b();
        }
        return this.f21643a;
    }

    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        } else {
            this.f = view;
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        com.taobao.taolive.sdk.core.j.a(this.i, this.j);
        f fVar = this.h;
        if (fVar == null) {
            return;
        }
        fVar.removeCallbacksAndMessages(null);
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        c();
        com.taobao.taolive.sdk.core.j.a(this.i, this.j, new MessageTypeFilter() { // from class: com.taobao.taolive.room.minilive.c.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.model.message.MessageTypeFilter
            public boolean filter(int i) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("c81f1ee8", new Object[]{this, new Integer(i)})).booleanValue() : i == 10091 || i == 10092;
            }
        });
        VideoInfo u = poy.u(this.i);
        if (u == null || u.curItemList == null || u.curItemList.size() <= 0) {
            return;
        }
        a(u.curItemList);
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.f21643a.setVisibility(8);
        this.b = (AliUrlImageView) this.f21643a.findViewById(R.id.taolive_showcase_item_icon);
        this.c = (TextView) this.f21643a.findViewById(R.id.taolive_showcase_item_name);
        this.d = (TextView) this.f21643a.findViewById(R.id.taolive_showcase_item_price);
        this.e = (TextView) this.f21643a.findViewById(R.id.tv_index_new);
        int a2 = com.taobao.taolive.room.utils.d.a(this.g, 50.0f);
        this.b.setRoundeCornerView(a2, a2, com.taobao.taolive.room.utils.d.a(this.g, 6.0f), 0, 0);
    }

    private boolean a(List<LiveItem> list) {
        VideoInfo u;
        TextView textView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c705295d", new Object[]{this, list})).booleanValue();
        }
        if ((list != null ? list.size() : 0) == 1) {
            LiveItem liveItem = list.get(0);
            this.f21643a.setVisibility(0);
            if (liveItem.goodsIndex > 0 && (textView = this.e) != null) {
                textView.setVisibility(0);
                this.e.setText(Integer.toString(liveItem.goodsIndex));
            } else {
                TextView textView2 = this.e;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                }
            }
            this.b.setImageUrl(liveItem.itemPic);
            SpannableString spannableString = new SpannableString(t.a(liveItem.itemPrice));
            spannableString.setSpan(new AbsoluteSizeSpan(com.taobao.taolive.room.utils.d.a(this.g, 12.0f)), 0, 1, 33);
            this.d.setText(spannableString);
            this.c.setText(liveItem.itemName);
            aa.K();
            d();
        }
        if (aa.b() && (u = poy.u(this.i)) != null && u.curItemList != null && u.curItemList.size() > 0 && list != null && list.get(0) != null) {
            if (u.curItemList.get(0) != null) {
                list.get(0).personalityData = u.curItemList.get(0).personalityData;
            }
            u.curItemList = new ArrayList<>();
            u.curItemList.addAll(list);
        }
        return true;
    }

    private void d() {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        View view2 = this.f;
        if (view2 == null || (view = this.f21643a) == null) {
            return;
        }
        e.b(view2, view);
    }

    private void e() {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        View view2 = this.f;
        if (view2 == null || (view = this.f21643a) == null) {
            return;
        }
        e.a(view, view2);
    }

    @Override // com.taobao.taolive.sdk.model.a
    public void handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
        } else if (message.what != 1001) {
        } else {
            e();
        }
    }
}
