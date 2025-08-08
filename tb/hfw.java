package tb;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.android.live.plugin.atype.flexalocal.comments.chat.b;
import com.taobao.android.live.plugin.atype.flexalocal.comments.chat.e;
import com.taobao.taolive.room.utils.aw;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.message.ChatMessage;
import com.taobao.taolive.sdk.utils.q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes5.dex */
public final class hfw extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final int Class_Verify_Code;
    private Context c;
    private TBLiveDataModel d;
    private a e;
    private e g;
    private int f = -1;
    private ArrayList<ChatMessage> b = new ArrayList<>();

    public static /* synthetic */ Object ipc$super(hfw hfwVar, String str, Object... objArr) {
        if (str.hashCode() == 1216347414) {
            super.onViewDetachedFromWindow((RecyclerView.ViewHolder) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    static {
        kge.a(150324513);
        Class_Verify_Code = hfw.class.hashCode();
    }

    public hfw(Context context, TBLiveDataModel tBLiveDataModel, a aVar) {
        this.c = context;
        this.d = tBLiveDataModel;
        this.e = aVar;
    }

    public void a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0a6997c", new Object[]{this, eVar});
        } else {
            this.g = eVar;
        }
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    /* renamed from: onCreateViewHolder */
    public RecyclerView.ViewHolder mo1596onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.ViewHolder) ipChange.ipc$dispatch("12368d2e", new Object[]{this, viewGroup, new Integer(i)});
        }
        try {
            hfy a2 = hfu.a(this, viewGroup, i, this.e);
            a2.a(this.g);
            return a2;
        } catch (Throwable unused) {
            View view = new View(viewGroup.getContext());
            view.setLayoutParams(new ViewGroup.LayoutParams(0, 0));
            return new hfy(view, this.e) { // from class: tb.hfw.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.hfy
                public void a(ChatMessage chatMessage, TBLiveDataModel tBLiveDataModel) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a533f5b8", new Object[]{this, chatMessage, tBLiveDataModel});
                    }
                }
            };
        }
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1071b8aa", new Object[]{this, viewHolder, new Integer(i)});
            return;
        }
        try {
            ((hfy) viewHolder).a(this.b.get(i), this.d);
        } catch (Throwable th) {
            viewHolder.setIsRecyclable(false);
            viewHolder.itemView.setVisibility(8);
            a(th.toString());
        }
    }

    public void a(ChatMessage chatMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d487357f", new Object[]{this, chatMessage});
        } else if (chatMessage == null || chatMessage.chatItemCommonData == null || this.b == null) {
        } else {
            d(chatMessage);
        }
    }

    public void b(ChatMessage chatMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fddb8ac0", new Object[]{this, chatMessage});
        } else if (chatMessage == null || this.b == null) {
        } else {
            d(chatMessage);
        }
    }

    private void d(ChatMessage chatMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50843542", new Object[]{this, chatMessage});
            return;
        }
        if (this.b.size() >= 200) {
            this.b.remove(0);
            notifyItemRemoved(0);
            int i = this.f;
            if (i >= 0) {
                this.f = i - 1;
            }
        }
        int size = this.b.size();
        if (size < 0) {
            return;
        }
        this.b.add(chatMessage);
        notifyItemInserted(size);
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        ArrayList<ChatMessage> arrayList = this.b;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    private boolean e(ChatMessage chatMessage) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("79d88a87", new Object[]{this, chatMessage})).booleanValue() : chatMessage != null && (chatMessage.mType == ChatMessage.MessageType.ENTER || chatMessage.mType == ChatMessage.MessageType.FOLLOW || chatMessage.mType == ChatMessage.MessageType.TXT || chatMessage.mType == ChatMessage.MessageType.TRADE);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        ArrayList<ChatMessage> arrayList = this.b;
        if (arrayList == null) {
            return;
        }
        arrayList.clear();
        notifyDataSetChanged();
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.f = -1;
        }
    }

    public void a(ChatMessage chatMessage, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc602d35", new Object[]{this, chatMessage, new Boolean(z)});
        } else if (chatMessage == null || this.b == null || !e(chatMessage)) {
        } else {
            if (chatMessage.mType == ChatMessage.MessageType.ENTER && this.b.size() > 0) {
                ArrayList<ChatMessage> arrayList = this.b;
                ChatMessage chatMessage2 = arrayList.get(arrayList.size() - 1);
                if (chatMessage2.mType == ChatMessage.MessageType.ENTER) {
                    chatMessage2.mEnterUsers.clear();
                    chatMessage2.mEnterUsers.addAll(chatMessage.mEnterUsers);
                    if (!z) {
                        return;
                    }
                    notifyDataSetChanged();
                    return;
                }
            }
            boolean f = b.d() ? f(chatMessage) : false;
            if (this.b.size() >= 200) {
                this.b.remove(0);
                if (z) {
                    notifyItemRemoved(0);
                }
                int i = this.f;
                if (i >= 0) {
                    this.f = i - 1;
                }
            }
            int size = this.b.size();
            if (size < 0) {
                return;
            }
            this.b.add(chatMessage);
            if (z) {
                notifyItemInserted(size);
            }
            if (!f) {
                return;
            }
            int i2 = this.f;
            if (i2 >= 0 && z) {
                notifyItemChanged(i2);
            }
            this.f = size;
        }
    }

    private boolean f(ChatMessage chatMessage) {
        ChatMessage chatMessage2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a32cdfc8", new Object[]{this, chatMessage})).booleanValue();
        }
        if (chatMessage.mType == ChatMessage.MessageType.TXT && !StringUtils.isEmpty(chatMessage.mContent) && (chatMessage.renders == null || StringUtils.isEmpty(chatMessage.renders.get(aw.PARAM_CHAT_RENDERS_ENHANCE)))) {
            for (int size = this.b.size() - 1; size >= Math.max(0, this.b.size() - 20); size--) {
                ChatMessage chatMessage3 = this.b.get(size);
                if (chatMessage3 != null && chatMessage.mContent.equals(chatMessage3.mContent)) {
                    if (chatMessage.renders == null) {
                        chatMessage.renders = new HashMap<>();
                    }
                    chatMessage.renders.put(aw.PARAM_CHAT_RENDERS_ENHANCE, hfv.KEY_ADD_ONE);
                    int i = this.f;
                    if (i >= 0 && i < this.b.size() && (chatMessage2 = this.b.get(this.f)) != null && chatMessage2.renders != null) {
                        chatMessage2.renders.remove(aw.PARAM_CHAT_RENDERS_ENHANCE);
                    }
                    return true;
                }
            }
        }
        return false;
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
                if (e(next)) {
                    arrayList2.add(next);
                }
            }
            int size = (arrayList2.size() + this.b.size()) - 200;
            if (size > 0) {
                for (int i = 0; i < size && !arrayList2.isEmpty(); i++) {
                    arrayList2.remove(0);
                }
            }
            if (arrayList2.size() > 0) {
                this.b.addAll(0, arrayList2);
                notifyItemRangeInserted(0, arrayList2.size());
            }
        }
    }

    public ChatMessage a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ChatMessage) ipChange.ipc$dispatch("95d082f2", new Object[]{this, new Integer(i)});
        }
        ArrayList<ChatMessage> arrayList = this.b;
        if (arrayList != null && arrayList.size() > 0 && i >= 0 && i < this.b.size()) {
            return this.b.get(i);
        }
        return null;
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("65c98627", new Object[]{this, new Integer(i)})).intValue() : hfv.a(a(i));
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("487ffd16", new Object[]{this, viewHolder});
            return;
        }
        try {
            super.onViewDetachedFromWindow(viewHolder);
        } catch (Throwable th) {
            a(th.toString());
            viewHolder.setIsRecyclable(false);
        }
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            q.b("NewChatListAdapter", str);
        }
    }
}
