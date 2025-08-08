package com.network.diagnosis.toolchain;

import android.content.Context;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.RequestCb;
import anet.channel.Session;
import anet.channel.bytes.ByteArray;
import anet.channel.entity.ConnInfo;
import anet.channel.entity.ConnType;
import anet.channel.entity.Event;
import anet.channel.entity.EventCb;
import anet.channel.request.Request;
import anet.channel.session.HttpConnector;
import anet.channel.session.TnetSpdySession;
import anet.channel.statist.RequestStatistic;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.ConnProtocol;
import anet.channel.strategy.IConnStrategy;
import anet.channel.strategy.ProxyStrategy;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.HttpUrl;
import anet.channel.util.TlsSniSocketFactory;
import com.alibaba.ability.localization.b;
import com.alibaba.android.split.core.splitcompat.j;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.k;
import com.taobao.tao.BaseActivity;
import com.taobao.taobao.R;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public class InternalDetectActivity extends BaseActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private EditText f8073a;
    private EditText b;
    private EditText c;
    private Spinner d;
    private Button e;
    private TextView f;
    private TextView g;
    private AtomicInteger h = new AtomicInteger(1);

    public static /* synthetic */ Object ipc$super(InternalDetectActivity internalDetectActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode != 514894248) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.attachBaseContext((Context) objArr[0]);
            return null;
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        j.b(context);
    }

    public static /* synthetic */ TextView a(InternalDetectActivity internalDetectActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("13607769", new Object[]{internalDetectActivity}) : internalDetectActivity.f;
    }

    public static /* synthetic */ void a(InternalDetectActivity internalDetectActivity, int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79a3d8d6", new Object[]{internalDetectActivity, new Integer(i), new Long(j)});
        } else {
            internalDetectActivity.a(i, j);
        }
    }

    public static /* synthetic */ void a(InternalDetectActivity internalDetectActivity, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea0874f0", new Object[]{internalDetectActivity, map});
        } else {
            internalDetectActivity.a(map);
        }
    }

    public static /* synthetic */ void a(InternalDetectActivity internalDetectActivity, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79abe97c", new Object[]{internalDetectActivity, bArr});
        } else {
            internalDetectActivity.a(bArr);
        }
    }

    public static /* synthetic */ TextView b(InternalDetectActivity internalDetectActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("cb4ce4ea", new Object[]{internalDetectActivity}) : internalDetectActivity.g;
    }

    public static /* synthetic */ void c(InternalDetectActivity internalDetectActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3505ef7", new Object[]{internalDetectActivity});
        } else {
            internalDetectActivity.b();
        }
    }

    @Override // com.taobao.tao.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.network_internal_detect);
        getSupportActionBar().a(b.a(R.string.taobao_app_1012_1_14008));
        getSupportActionBar().b(getResources().getDrawable(R.color.nd_white));
        a();
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.f8073a = (EditText) findViewById(R.id.et_url);
        this.b = (EditText) findViewById(R.id.et_ip);
        this.c = (EditText) findViewById(R.id.et_port);
        this.d = (Spinner) findViewById(R.id.sp_protocol);
        this.e = (Button) findViewById(R.id.btn_start);
        this.f = (TextView) findViewById(R.id.tv_result);
        this.g = (TextView) findViewById(R.id.tv_content);
        this.e.setOnClickListener(new View.OnClickListener() { // from class: com.network.diagnosis.toolchain.InternalDetectActivity.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                InternalDetectActivity.a(InternalDetectActivity.this).setText("");
                InternalDetectActivity.b(InternalDetectActivity.this).setText("");
                ThreadPoolExecutorFactory.submitDetectTask(new Runnable() { // from class: com.network.diagnosis.toolchain.InternalDetectActivity.1.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            InternalDetectActivity.c(InternalDetectActivity.this);
                        }
                    }
                });
            }
        });
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        String obj = this.f8073a.getEditableText().toString();
        String obj2 = this.b.getEditableText().toString();
        int intValue = StringUtils.isEmpty(this.c.getEditableText().toString()) ? 80 : Integer.valueOf(this.c.getEditableText().toString()).intValue();
        String obj3 = this.d.getSelectedItem().toString();
        if (StringUtils.isEmpty(obj) || HttpUrl.parse(obj) == null) {
            a(b.a(R.string.taobao_app_1012_1_14025));
        } else if (!NetworkStatusHelper.isConnected()) {
            a(b.a(R.string.taobao_app_1012_1_14038));
        } else if (obj3.equals("http") || obj3.equals("https")) {
            a(obj, obj2, intValue, obj3);
        } else {
            b(obj, obj2, intValue, obj3);
        }
    }

    private void a(String str, String str2, int i, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("608d2b11", new Object[]{this, str, str2, new Integer(i), str3});
            return;
        }
        HttpUrl parse = HttpUrl.parse(str);
        parse.setScheme(str3);
        Request build = new Request.Builder().setUrl(parse).addHeader("Connection", "close").setRedirectEnable(false).setReadTimeout(5000).setConnectTimeout(5000).setSslSocketFactory(new TlsSniSocketFactory(parse.host())).setSeq("ND").build();
        if (!StringUtils.isEmpty(str2)) {
            build.setDnsOptimize(str2, i);
        }
        long currentTimeMillis = System.currentTimeMillis();
        HttpConnector.Response connect = HttpConnector.connect(build);
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (connect == null) {
            a(b.a(R.string.taobao_app_1012_1_14012));
            return;
        }
        a(connect.httpCode, currentTimeMillis2);
        if (connect.header == null) {
            return;
        }
        a(connect.header);
        if (connect.out == null) {
            return;
        }
        a(connect.out);
    }

    private void b(String str, String str2, int i, String str3) {
        ConnProtocol valueOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6690f670", new Object[]{this, str, str2, new Integer(i), str3});
            return;
        }
        String[] split = str3.split("_");
        if (split.length == 3) {
            valueOf = ConnProtocol.valueOf(split[0], split[1], split[2]);
        } else {
            valueOf = ConnProtocol.valueOf(str3, null, null);
        }
        final String str4 = "ND" + this.h.getAndIncrement();
        ConnType valueOf2 = ConnType.valueOf(valueOf);
        final HttpUrl parse = HttpUrl.parse(str);
        if (valueOf2 == null || parse == null) {
            return;
        }
        if (StringUtils.isEmpty(str2)) {
            try {
                str2 = InetAddress.getByName(parse.host()).getHostAddress();
            } catch (UnknownHostException unused) {
            }
        }
        Context context = GlobalAppRuntimeInfo.getContext();
        StringBuilder sb = new StringBuilder();
        sb.append(valueOf2.isSSL() ? k.HTTPS_PREFIX : k.HTTP_PREFIX);
        sb.append(parse.host());
        final TnetSpdySession tnetSpdySession = new TnetSpdySession(context, new ConnInfo(sb.toString(), str4, a(valueOf, str2, i)));
        final long currentTimeMillis = System.currentTimeMillis();
        tnetSpdySession.registerEventcb(257, new EventCb() { // from class: com.network.diagnosis.toolchain.InternalDetectActivity.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // anet.channel.entity.EventCb
            public void onEvent(Session session, int i2, Event event) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("786c54ab", new Object[]{this, session, new Integer(i2), event});
                } else if (i2 == 1) {
                    tnetSpdySession.request(new Request.Builder().setUrl(parse).setReadTimeout(5000).setRedirectEnable(false).setSeq(str4).build(), new RequestCb() { // from class: com.network.diagnosis.toolchain.InternalDetectActivity.2.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // anet.channel.RequestCb
                        public void onResponseCode(int i3, Map<String, List<String>> map) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("38c34976", new Object[]{this, new Integer(i3), map});
                            } else {
                                InternalDetectActivity.a(InternalDetectActivity.this, map);
                            }
                        }

                        @Override // anet.channel.RequestCb
                        public void onDataReceive(ByteArray byteArray, boolean z) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("a65ed612", new Object[]{this, byteArray, new Boolean(z)});
                            } else if (byteArray == null) {
                            } else {
                                InternalDetectActivity.a(InternalDetectActivity.this, byteArray.getBuffer());
                            }
                        }

                        @Override // anet.channel.RequestCb
                        public void onFinish(int i3, String str5, RequestStatistic requestStatistic) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("c490acd4", new Object[]{this, new Integer(i3), str5, requestStatistic});
                                return;
                            }
                            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                            tnetSpdySession.close(false);
                            if (i3 == -304 && requestStatistic != null) {
                                i3 = requestStatistic.tnetErrorCode;
                            }
                            InternalDetectActivity.a(InternalDetectActivity.this, i3, currentTimeMillis2);
                        }
                    });
                } else {
                    InternalDetectActivity.a(InternalDetectActivity.this, event.errorCode, System.currentTimeMillis() - currentTimeMillis);
                }
            }
        });
        tnetSpdySession.connect();
    }

    private void a(final int i, final long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c115689", new Object[]{this, new Integer(i), new Long(j)});
        } else {
            runOnUiThread(new Runnable() { // from class: com.network.diagnosis.toolchain.InternalDetectActivity.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    TextView a2;
                    int i2;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    if (i != 200) {
                        a2 = InternalDetectActivity.a(InternalDetectActivity.this);
                        i2 = -65536;
                    } else {
                        a2 = InternalDetectActivity.a(InternalDetectActivity.this);
                        i2 = -16711936;
                    }
                    a2.setTextColor(i2);
                    TextView a3 = InternalDetectActivity.a(InternalDetectActivity.this);
                    a3.setText(b.a(R.string.taobao_app_1012_1_14021) + i + b.a(R.string.taobao_app_1012_1_14030) + j + "ms");
                }
            });
        }
    }

    private void a(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            runOnUiThread(new Runnable() { // from class: com.network.diagnosis.toolchain.InternalDetectActivity.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    InternalDetectActivity.a(InternalDetectActivity.this).setTextColor(-65536);
                    InternalDetectActivity.a(InternalDetectActivity.this).setText(str);
                }
            });
        }
    }

    private void a(final Map<String, List<String>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else {
            runOnUiThread(new Runnable() { // from class: com.network.diagnosis.toolchain.InternalDetectActivity.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    TextView b = InternalDetectActivity.b(InternalDetectActivity.this);
                    b.append("headers:\n" + map + "\n\nbody:\n");
                }
            });
        }
    }

    private void a(final byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c19672f", new Object[]{this, bArr});
        } else {
            runOnUiThread(new Runnable() { // from class: com.network.diagnosis.toolchain.InternalDetectActivity.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        InternalDetectActivity.b(InternalDetectActivity.this).append(new String(bArr));
                    }
                }
            });
        }
    }

    private static IConnStrategy a(final ConnProtocol connProtocol, final String str, final int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IConnStrategy) ipChange.ipc$dispatch("192ac849", new Object[]{connProtocol, str, new Integer(i)}) : new IConnStrategy() { // from class: com.network.diagnosis.toolchain.InternalDetectActivity.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // anet.channel.strategy.IConnStrategy
            public String getAccessPoint() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (String) ipChange2.ipc$dispatch("7a134b63", new Object[]{this});
                }
                return null;
            }

            @Override // anet.channel.strategy.IConnStrategy
            public Map<String, Object> getCommonInfo() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Map) ipChange2.ipc$dispatch("6eaa1deb", new Object[]{this});
                }
                return null;
            }

            @Override // anet.channel.strategy.IConnStrategy
            public int getConnectionTimeout() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("3af0dde7", new Object[]{this})).intValue();
                }
                return 5000;
            }

            @Override // anet.channel.strategy.IConnStrategy
            public int getHeartbeat() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("5d15d3c0", new Object[]{this})).intValue();
                }
                return 0;
            }

            @Override // anet.channel.strategy.IConnStrategy
            public int getIpSource() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("e15dde12", new Object[]{this})).intValue();
                }
                return 2;
            }

            @Override // anet.channel.strategy.IConnStrategy
            public int getIpType() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("d9c8f8f1", new Object[]{this})).intValue();
                }
                return 1;
            }

            @Override // anet.channel.strategy.IConnStrategy
            public List<ProxyStrategy> getProxyStrategies() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (List) ipChange2.ipc$dispatch("69e2ba17", new Object[]{this});
                }
                return null;
            }

            @Override // anet.channel.strategy.IConnStrategy
            public int getReadTimeout() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("4db89faf", new Object[]{this})).intValue();
                }
                return 5000;
            }

            @Override // anet.channel.strategy.IConnStrategy
            public int getRetryTimes() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("58b4bfee", new Object[]{this})).intValue();
                }
                return 0;
            }

            @Override // anet.channel.strategy.IConnStrategy
            public int getStatus() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("fcf6c362", new Object[]{this})).intValue();
                }
                return -1;
            }

            @Override // anet.channel.strategy.IConnStrategy
            public String getUnit() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (String) ipChange2.ipc$dispatch("9e7fcd3f", new Object[]{this});
                }
                return null;
            }

            @Override // anet.channel.strategy.IConnStrategy
            public boolean isSupportMultiPath() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("43485f44", new Object[]{this})).booleanValue();
                }
                return false;
            }

            @Override // anet.channel.strategy.IConnStrategy
            public String getIp() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("d02517fc", new Object[]{this}) : str;
            }

            @Override // anet.channel.strategy.IConnStrategy
            public int getPort() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("a73231f1", new Object[]{this})).intValue() : i;
            }

            @Override // anet.channel.strategy.IConnStrategy
            public ConnProtocol getProtocol() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (ConnProtocol) ipChange2.ipc$dispatch("f3fe3d0f", new Object[]{this}) : connProtocol;
            }
        };
    }
}
