package com.taobao.taolive.room.minilive;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.taolive.room.utils.v;
import com.taobao.taolive.sdk.model.message.ChatMessage;
import java.util.ArrayList;
import java.util.Iterator;
import tb.kge;
import tb.pmd;

/* loaded from: classes8.dex */
public class a extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Context b;

    /* renamed from: a  reason: collision with root package name */
    public int f21639a = 10;
    private int d = -1;
    private ArrayList<ChatMessage> c = new ArrayList<>();

    /* renamed from: com.taobao.taolive.room.minilive.a$1  reason: invalid class name */
    /* loaded from: classes8.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f21640a = new int[ChatMessage.MessageType.values().length];

        static {
            try {
                f21640a[ChatMessage.MessageType.FOLLOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21640a[ChatMessage.MessageType.ENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21640a[ChatMessage.MessageType.TXT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21640a[ChatMessage.MessageType.TRADE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        kge.a(-472954070);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public a(Context context) {
        this.b = context;
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    /* renamed from: onCreateViewHolder */
    public RecyclerView.ViewHolder mo1596onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView.ViewHolder) ipChange.ipc$dispatch("12368d2e", new Object[]{this, viewGroup, new Integer(i)}) : new C0899a(LayoutInflater.from(pmd.a().u().c()).inflate(R.layout.taolive_minilive_msg_item, viewGroup, false));
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1071b8aa", new Object[]{this, viewHolder, new Integer(i)});
        } else if (!(viewHolder instanceof C0899a)) {
        } else {
            ((C0899a) viewHolder).a(this.c.get(i));
        }
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        ArrayList<ChatMessage> arrayList = this.c;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public synchronized void a(ArrayList<ChatMessage> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfaf7e42", new Object[]{this, arrayList});
            return;
        }
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = new ArrayList();
            Iterator<ChatMessage> it = arrayList.iterator();
            while (it.hasNext()) {
                ChatMessage next = it.next();
                if (b(next)) {
                    arrayList2.add(next);
                }
            }
            int size = (arrayList2.size() + this.c.size()) - this.f21639a;
            if (size > 0) {
                for (int i = 0; i < size && !arrayList2.isEmpty(); i++) {
                    arrayList2.remove(0);
                }
            }
            if (arrayList2.size() > 0) {
                this.c.addAll(0, arrayList2);
                notifyItemRangeInserted(0, arrayList2.size());
            }
        }
    }

    public synchronized void a(ChatMessage chatMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d487357f", new Object[]{this, chatMessage});
            return;
        }
        if (chatMessage != null && this.c != null) {
            if (!b(chatMessage)) {
                return;
            }
            if (chatMessage.mType == ChatMessage.MessageType.ENTER && this.c.size() > 0) {
                ChatMessage chatMessage2 = this.c.get(this.c.size() - 1);
                if (chatMessage2.mType == ChatMessage.MessageType.ENTER) {
                    chatMessage2.mEnterUsers.clear();
                    chatMessage2.mEnterUsers.addAll(chatMessage.mEnterUsers);
                    notifyDataSetChanged();
                    return;
                }
            }
            this.c.add(chatMessage);
            if (this.c.size() > this.f21639a) {
                this.c.remove(0);
                if (this.d >= 0) {
                    this.d--;
                }
            }
            notifyDataSetChanged();
        }
    }

    private boolean b(ChatMessage chatMessage) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fddb8ac4", new Object[]{this, chatMessage})).booleanValue() : chatMessage != null && (chatMessage.mType == ChatMessage.MessageType.ENTER || chatMessage.mType == ChatMessage.MessageType.FOLLOW || chatMessage.mType == ChatMessage.MessageType.TXT || chatMessage.mType == ChatMessage.MessageType.TRADE);
    }

    /* renamed from: com.taobao.taolive.room.minilive.a$a  reason: collision with other inner class name */
    /* loaded from: classes8.dex */
    public static class C0899a extends RecyclerView.ViewHolder {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public TextView f21641a;
        public View b;

        static {
            kge.a(-53955256);
        }

        public C0899a(View view) {
            super(view);
            this.b = view;
            this.f21641a = (TextView) view.findViewById(R.id.taolive_chat_item_content);
        }

        public void a(ChatMessage chatMessage) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d487357f", new Object[]{this, chatMessage});
            } else if (chatMessage != null) {
                this.f21641a.setVisibility(8);
                int i = AnonymousClass1.f21640a[chatMessage.mType.ordinal()];
                if (i == 1) {
                    this.itemView.setBackgroundDrawable(pmd.a().u().c().getResources().getDrawable(R.drawable.taolive_chat_msg_follow_bg_flexalocal));
                    this.f21641a.setVisibility(0);
                    this.f21641a.setTextColor(pmd.a().u().c().getResources().getColor(R.color.taolive_chat_follow_text));
                    this.f21641a.setText(pmd.a().u().c().getResources().getString(R.string.taolive_follow_hint, v.a(chatMessage.mUserNick)));
                } else if (i == 2) {
                    this.itemView.setBackgroundDrawable(pmd.a().u().c().getResources().getDrawable(R.drawable.taolive_chat_msg_text_bg));
                    this.f21641a.setVisibility(0);
                    this.f21641a.setTextColor(pmd.a().u().c().getResources().getColor(R.color.taolive_text_color_gray));
                    this.f21641a.setText(chatMessage.mEnterUsers.get(chatMessage.mEnterUsers.size() - 1).name + " 进入直播间");
                } else if (i == 3) {
                    this.f21641a.setText((CharSequence) null);
                    this.f21641a.setVisibility(0);
                    this.f21641a.setTextColor(pmd.a().u().c().getResources().getColor(R.color.taolive_chat_follow_text));
                    String str = chatMessage.mUserNick + " ";
                    if (chatMessage.mSpannableContent != null) {
                        SpannableString spannableString = new SpannableString(str);
                        spannableString.setSpan(new ForegroundColorSpan(pmd.a().u().c().getResources().getColor(chatMessage.mNickColor)), 0, str.length(), 33);
                        this.f21641a.append(spannableString);
                        for (SpannableString spannableString2 : chatMessage.mSpannableContent) {
                            this.f21641a.append(spannableString2);
                        }
                        return;
                    }
                    SpannableString spannableString3 = new SpannableString(str + chatMessage.mContent);
                    spannableString3.setSpan(new ForegroundColorSpan(pmd.a().u().c().getResources().getColor(chatMessage.mNickColor)), 0, str.length(), 33);
                    this.f21641a.append(spannableString3);
                } else {
                    if (i != 4) {
                        return;
                    }
                    this.itemView.setBackgroundDrawable(pmd.a().u().c().getResources().getDrawable(R.drawable.taolive_chat_msg_trade_bg_flexalocal));
                    this.f21641a.setVisibility(0);
                    this.f21641a.setTextColor(pmd.a().u().c().getResources().getColor(17170443));
                    this.f21641a.setText(pmd.a().u().c().getResources().getString(R.string.taolive_trade_hint, chatMessage.mUserNick));
                }
            }
        }
    }
}
