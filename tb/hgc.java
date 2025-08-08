package tb;

import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.taobao.R;
import com.taobao.taolive.room.utils.aj;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.model.message.ChatMessage;
import java.util.HashMap;

/* loaded from: classes5.dex */
public class hgc extends hfz {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static boolean h;
    private hfw i;

    public static /* synthetic */ Object ipc$super(hgc hgcVar, String str, Object... objArr) {
        if (str.hashCode() == -1523321416) {
            super.a((ChatMessage) objArr[0], (TBLiveDataModel) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void a(hgc hgcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebe66514", new Object[]{hgcVar});
        } else {
            hgcVar.b();
        }
    }

    public static /* synthetic */ hfw b(hgc hgcVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (hfw) ipChange.ipc$dispatch("74d07d38", new Object[]{hgcVar}) : hgcVar.i;
    }

    static {
        kge.a(2096952012);
        h = false;
    }

    public hgc(ViewGroup viewGroup, hfw hfwVar, View view, a aVar) {
        super(view, viewGroup, aVar);
        this.i = hfwVar;
        this.f = (TextView) view.findViewById(R.id.taolive_chat_item_content);
        this.g = (TextView) view.findViewById(R.id.taolive_chat_item_action);
        this.f28605a = (TextView) view.findViewById(R.id.taolive_chat_item_name);
    }

    @Override // tb.hfy
    public void a(ChatMessage chatMessage, final TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a533f5b8", new Object[]{this, chatMessage, tBLiveDataModel});
            return;
        }
        super.a(chatMessage, tBLiveDataModel);
        TextView textView = this.f28605a;
        textView.setText(chatMessage.mUserNick + " ");
        this.f.setText(chatMessage.mContent);
        if (tBLiveDataModel == null || this.j) {
            this.g.setVisibility(8);
            return;
        }
        VideoInfo videoInfo = tBLiveDataModel.mVideoInfo;
        if ((videoInfo == null || videoInfo.broadCaster == null) ? false : videoInfo.broadCaster.follow) {
            this.g.setVisibility(8);
        } else {
            if (!h) {
                h = true;
                HashMap<String, String> hashMap = new HashMap<>();
                hashMap.put("follow_location", tfu.COMMENT);
                phg.a().a((a) this.e, "Show-AccountFollow", hashMap);
            }
            this.g.setVisibility(0);
            this.g.setText("我也关注");
            this.g.setOnClickListener(new View.OnClickListener() { // from class: tb.hgc.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else {
                        a();
                    }
                }

                private void a() {
                    String str;
                    String str2;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    VideoInfo videoInfo2 = tBLiveDataModel.mVideoInfo;
                    String str3 = "";
                    if (videoInfo2 != null) {
                        if (videoInfo2.broadCaster != null) {
                            str3 = videoInfo2.broadCaster.accountId;
                            str2 = videoInfo2.broadCaster.type;
                        } else {
                            str2 = str3;
                        }
                        str = videoInfo2.liveId;
                    } else {
                        str = str3;
                        str2 = str;
                    }
                    if (StringUtils.isEmpty(str3) || StringUtils.isEmpty(str2)) {
                        return;
                    }
                    pmt pmtVar = new pmt();
                    pmtVar.c = str;
                    pmtVar.b = str2;
                    pmtVar.f32764a = str3;
                    pmtVar.p = pmt.FOLLOW_COMMENT;
                    pmt a2 = phg.a().a(hgc.this.e, pmtVar);
                    final String str4 = a2.f32764a;
                    pmd.a().B().a(a2, new pmv() { // from class: tb.hgc.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // tb.pmv
                        public void a(pmz pmzVar) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("f9ec2b9b", new Object[]{this, pmzVar});
                                return;
                            }
                            aj.a(hgc.this.d, plz.a(hgc.this.d, pmzVar));
                            hgc.a(hgc.this);
                            hgc.b(hgc.this).notifyDataSetChanged();
                            hgc.this.e.e().a(xkw.EVENT_ACTION_FOLLOW, str4, hgc.this.e == null ? null : hgc.this.e.G());
                        }

                        @Override // tb.pmv
                        public void a(String str5, String str6) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("d9378d7c", new Object[]{this, str5, str6});
                                return;
                            }
                            String string = hgc.this.d.getResources().getString(R.string.taolive_comments_user_follow_fail_flexalocal);
                            if (!StringUtils.isEmpty(str6)) {
                                string = str6;
                            }
                            aj.a(hgc.this.d, string);
                        }
                    });
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("follow_location", tfu.COMMENT);
                    phg.a().a(hgc.this.e, hgc.this.itemView.getContext(), str3, hashMap2);
                    jzn.a(hgc.this.e, "follow", 0L);
                }
            });
        }
        a();
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        VideoInfo videoInfo = this.c.mVideoInfo;
        if (videoInfo == null || videoInfo.broadCaster == null) {
            return;
        }
        videoInfo.broadCaster.follow = true;
    }
}
