package tb;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.android.live.plugin.atype.flexalocal.comments.chat.e;
import com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.ChatRecyclerView2;
import com.taobao.android.nav.Nav;
import com.taobao.taobao.R;
import com.taobao.taolive.room.utils.n;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.model.message.ChatMessage;
import com.taobao.taolive.sdk.utils.b;
import com.taobao.uikit.extend.feature.view.TUrlImageView;

/* loaded from: classes5.dex */
public abstract class hfy extends RecyclerView.ViewHolder implements View.OnClickListener, View.OnLongClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private e f28604a;
    public ChatMessage b;
    public TBLiveDataModel c;
    public Context d;
    public phq e;
    private boolean f;

    static {
        kge.a(1505081411);
        kge.a(1426707756);
        kge.a(-1201612728);
    }

    public static /* synthetic */ Object ipc$super(hfy hfyVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public hfy(View view, a aVar) {
        super(view);
        this.d = view.getContext();
        this.e = (phq) aVar;
        this.f = hgs.q();
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), b.a(view.getContext(), ChatRecyclerView2.recycleViewItemCornerIconPaddingWidthDP), view.getPaddingBottom());
        view.setOnLongClickListener(this);
        view.setOnClickListener(this);
    }

    public void a(ChatMessage chatMessage, TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a533f5b8", new Object[]{this, chatMessage, tBLiveDataModel});
            return;
        }
        this.b = chatMessage;
        this.c = tBLiveDataModel;
    }

    public void a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0a6997c", new Object[]{this, eVar});
        } else {
            this.f28604a = eVar;
        }
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7edba102", new Object[]{this, view})).booleanValue();
        }
        e eVar = this.f28604a;
        if (eVar != null) {
            eVar.a(view, this.b);
        }
        return true;
    }

    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (phg.d().a()) {
            a("commentItemCLick isDianTaoApp.");
        } else if (!this.f) {
            a("commentItemCLick mEnableJumpGuangGuangPage is false.");
        } else {
            VideoInfo u = poy.u(n.a());
            if (this.b == null || u == null || u.admireInfo == null) {
                a("commentItemCLick data is null.");
            } else if (!u.admireInfo.contributionEnabled) {
                a("commentItemCLick data admireInfo contributionEnabled is false.");
            } else if (this.b.renders == null || this.b.renders.isEmpty() || TextUtils.isEmpty(this.b.renders.get("guangGuangJumpUrl"))) {
            } else {
                Nav.from(this.d).toUri(this.b.renders.get("guangGuangJumpUrl"));
            }
        }
    }

    public void a(ChatMessage chatMessage, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c82bcf3", new Object[]{this, chatMessage, view});
            return;
        }
        View findViewById = view.findViewById(R.id.taolive_chat_item_bubble);
        TUrlImageView tUrlImageView = (TUrlImageView) view.findViewById(R.id.taolive_chat_item_corner_icon);
        try {
            JSONObject a2 = a(chatMessage);
            if (a2 == null) {
                findViewById.setBackground(view.getResources().getDrawable(R.drawable.taolive_comment_bg_new_flexalocal));
                tUrlImageView.setVisibility(8);
                return;
            }
            String string = a2.getString("startColor");
            String string2 = a2.getString("endColor");
            String string3 = a2.getString("activityIcon");
            tUrlImageView.setVisibility(0);
            tUrlImageView.setImageUrl(string3);
            Drawable drawable = view.getContext().getDrawable(R.drawable.taolive_comment_bg_unique_flexalocal);
            if (!(drawable instanceof GradientDrawable)) {
                return;
            }
            GradientDrawable gradientDrawable = (GradientDrawable) drawable;
            gradientDrawable.setColors(new int[]{Color.parseColor(string), Color.parseColor(string2)});
            gradientDrawable.setCornerRadius(b.a(view.getContext(), 12.0f));
            findViewById.setBackground(gradientDrawable);
        } catch (Exception unused) {
            findViewById.setBackground(view.getResources().getDrawable(R.drawable.taolive_comment_bg_new_flexalocal));
            tUrlImageView.setVisibility(8);
        }
    }

    private JSONObject a(ChatMessage chatMessage) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("8b8249f", new Object[]{this, chatMessage});
        }
        if (chatMessage == null) {
            return null;
        }
        if (chatMessage.renders != null && chatMessage.renders.containsKey("backgroundStyle")) {
            return (JSONObject) JSONObject.parse(chatMessage.renders.get("backgroundStyle"));
        }
        if (chatMessage.mExtraParams != null && (jSONObject = (JSONObject) JSONObject.parse(chatMessage.mExtraParams.toString())) != null && (jSONObject2 = (JSONObject) jSONObject.get("ext")) != null) {
            JSONObject jSONObject3 = (JSONObject) jSONObject2.get("backgroundStyle");
            return (JSONObject) JSONObject.parse(jSONObject3 == null ? null : jSONObject3.toString());
        }
        return null;
    }

    public static View a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("9c7a352c", new Object[]{view});
        }
        if (view == null) {
            return null;
        }
        View findViewById = view.findViewById(R.id.taolive_chat_item_bubble);
        return findViewById == null ? view : findViewById;
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (pmd.a().m() == null) {
        } else {
            pmd.a().m().a("BaseChatItemViewHolder", str);
        }
    }
}
