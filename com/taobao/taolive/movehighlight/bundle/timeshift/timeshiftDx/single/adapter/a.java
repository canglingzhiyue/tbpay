package com.taobao.taolive.movehighlight.bundle.timeshift.timeshiftDx.single.adapter;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.text.SpannableString;
import mtopsdk.common.util.StringUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.taolive.room.utils.aw;
import com.taobao.taolive.sdk.model.message.ChatMessage;
import java.util.List;
import mtopsdk.network.impl.ResponseProtocolType;
import tb.kge;

/* loaded from: classes8.dex */
public class a extends RecyclerView.Adapter<C0897a> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f21451a;
    private List<ChatMessage> b;

    /* renamed from: com.taobao.taolive.movehighlight.bundle.timeshift.timeshiftDx.single.adapter.a$a  reason: collision with other inner class name */
    /* loaded from: classes8.dex */
    public class C0897a extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public TextView f21452a;

        static {
            kge.a(1973966789);
        }

        public C0897a(View view) {
            super(view);
            this.f21452a = (TextView) view.findViewById(R.id.comment_content_text);
        }
    }

    static {
        kge.a(159091852);
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public /* synthetic */ void onBindViewHolder(C0897a c0897a, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1071b8aa", new Object[]{this, c0897a, new Integer(i)});
        } else {
            a(c0897a, i);
        }
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [com.taobao.taolive.movehighlight.bundle.timeshift.timeshiftDx.single.adapter.a$a, android.support.v7.widget.RecyclerView$ViewHolder] */
    @Override // android.support.v7.widget.RecyclerView.Adapter
    /* renamed from: onCreateViewHolder */
    public /* synthetic */ C0897a mo1596onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView.ViewHolder) ipChange.ipc$dispatch("12368d2e", new Object[]{this, viewGroup, new Integer(i)}) : a(viewGroup, i);
    }

    public void a(ChatMessage chatMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d487357f", new Object[]{this, chatMessage});
            return;
        }
        List<ChatMessage> list = this.b;
        if (list == null) {
            return;
        }
        list.add(chatMessage);
    }

    public C0897a a(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (C0897a) ipChange.ipc$dispatch("d3589725", new Object[]{this, viewGroup, new Integer(i)}) : new C0897a(LayoutInflater.from(this.f21451a).inflate(R.layout.taolive_highlight_single_comment_item, (ViewGroup) null));
    }

    public void a(C0897a c0897a, int i) {
        ChatMessage chatMessage;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36b99730", new Object[]{this, c0897a, new Integer(i)});
            return;
        }
        List<ChatMessage> list = this.b;
        if (list == null || i >= list.size() || (chatMessage = this.b.get(i)) == null || c0897a.f21452a == null || chatMessage.mUserNick == null) {
            return;
        }
        c0897a.f21452a.setText((CharSequence) null);
        String str = (chatMessage.renders != null && StringUtils.equals(chatMessage.renders.get(aw.PARAM_CHAT_RENDERS_ENHANCE), "rewardAutoComment")) ? chatMessage.mUserNick + " " : chatMessage.mUserNick + ResponseProtocolType.COMMENT;
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#FFE8B4")), 0, str.length(), 33);
        c0897a.f21452a.append(spannableString);
        if (chatMessage.mSpannableContent != null) {
            for (SpannableString spannableString2 : chatMessage.mSpannableContent) {
                c0897a.f21452a.append(spannableString2);
            }
            return;
        }
        c0897a.f21452a.append(chatMessage.mContent);
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue() : this.b.size();
    }
}
