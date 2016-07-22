package com.example.lcy.topnews.entity;

import java.io.Serializable;
import java.util.List;

/**
 * 与其憧憬未来，不如把握现在。
 * Created by lcy on 2016-7-20.
 */
public class NewsEntity implements Serializable {

    /**
     * reason : 成功的返回
     * result : {"stat":"1","data":[{"title":"悲剧！佛山民间篮球赛 一球员替补席观战时猝死","date":"2016-07-20 10:02","category":"体育","author_name":"凤凰体育","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20160720/20160720100200_e5e54ee43acab7cde9deae0a4ad81d02_1_mwpm_03200403.jpeg","url":"http://mini.eastday.com/mobile/160720100200176.html?qid=juheshuju","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20160720/20160720100200_e5e54ee43acab7cde9deae0a4ad81d02_1_mwpl_05500201.jpeg"},{"title":"蓝军为后防新领袖拒德甲劲旅报价 曾入选赛季最佳","date":"2016-07-20 10:01","category":"体育","author_name":"凤凰体育","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20160720/20160720100159_7664a50a7d0cfcaf29a9b8587579e6d7_1_mwpm_03200403.jpeg","url":"http://mini.eastday.com/mobile/160720100159452.html?qid=juheshuju","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20160720/20160720100159_7664a50a7d0cfcaf29a9b8587579e6d7_1_mwpl_05500201.jpeg"},{"title":"巴博萨欲助太阳进季后赛 仍穿19号致敬拉贾-贝尔","date":"2016-07-20 10:01","category":"体育","author_name":"网易体育","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20160720/20160720100156_5250216fa462ef28e05020a82e4175db_1_mwpm_03200403.jpeg","url":"http://mini.eastday.com/mobile/160720100156665.html?qid=juheshuju","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20160720/20160720100156_5250216fa462ef28e05020a82e4175db_1_mwpl_05500201.jpeg"},{"title":"保罗自曝给KD转会建议:这是你生涯的大好转机","date":"2016-07-20 10:00","category":"体育","author_name":"东方网","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20160720/20160720100057_2bcfd279c8f4b3180524650d958222fa_1_mwpm_03200403.jpeg","url":"http://mini.eastday.com/mobile/160720100057326.html?qid=juheshuju","thumbnail_pic_s03":"http://05.imgmini.eastday.com/mobile/20160720/20160720100057_2bcfd279c8f4b3180524650d958222fa_1_mwpl_05500201.jpeg"},{"title":"玲听海风：第一章 传承还是遗产","date":"2016-07-20 09:59","category":"体育","author_name":"北京时间体育","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20160720/20160720095936_fa1f4576e417ae4fdd6645e7a48347da_1_mwpm_03200403.jpeg","url":"http://mini.eastday.com/mobile/160720095936833.html?qid=juheshuju","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20160720/20160720095936_fa1f4576e417ae4fdd6645e7a48347da_1_mwpl_05500201.jpeg"},{"title":"意新帅：佩莱小心蹈迪亚曼蒂覆辙 去中超只剩钱","date":"2016-07-20 09:59","category":"体育","author_name":"搜狐体育","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20160720/20160720095909_105cbe5c0d1d930e788c5fdcab6e1e63_1_mwpm_03200403.jpeg","url":"http://mini.eastday.com/mobile/160720095909150.html?qid=juheshuju","thumbnail_pic_s03":"http://08.imgmini.eastday.com/mobile/20160720/20160720095909_105cbe5c0d1d930e788c5fdcab6e1e63_1_mwpl_05500201.jpeg"},{"title":"李楠:男篮所在组是最强组 形势不乐观力争佳绩","date":"2016-07-20 09:58","category":"体育","author_name":"中华网","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20160720/20160720095815_93d23639b081618e0428c8fa8d5c5aad_1_mwpm_03200403.jpeg","url":"http://mini.eastday.com/mobile/160720095815551.html?qid=juheshuju","thumbnail_pic_s03":"http://03.imgmini.eastday.com/mobile/20160720/20160720095815_93d23639b081618e0428c8fa8d5c5aad_1_mwpl_05500201.jpeg"},{"title":"意大利主帅：佩莱还有机会 别成下个迪亚曼蒂","date":"2016-07-20 09:57","category":"体育","author_name":"腾讯体育","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20160720/20160720095753_32d3732b75f6d979ba3a1f2e9da7167b_1_mwpm_03200403.jpeg","url":"http://mini.eastday.com/mobile/160720095753010.html?qid=juheshuju","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20160720/20160720095753_32d3732b75f6d979ba3a1f2e9da7167b_1_mwpl_05500201.jpeg"},{"title":"西媒:宁泽涛经波折将战里约 他是中国全民偶像","date":"2016-07-20 09:57","category":"体育","author_name":"腾讯体育","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20160720/20160720095751_4c36c2ded3d084b8a942df8a911eae00_1_mwpm_03200403.jpeg","url":"http://mini.eastday.com/mobile/160720095751582.html?qid=juheshuju","thumbnail_pic_s03":"http://05.imgmini.eastday.com/mobile/20160720/20160720095751_4c36c2ded3d084b8a942df8a911eae00_1_mwpl_05500201.jpeg"},{"title":"欧文：曾经是杜兰特球迷 国家队经历让人难忘","date":"2016-07-20 09:57","category":"体育","author_name":"腾讯体育","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20160720/20160720095751_9c39145bbb681243042a4adc43b3c3b2_1_mwpm_03200403.jpeg","url":"http://mini.eastday.com/mobile/160720095751099.html?qid=juheshuju","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20160720/20160720095751_9c39145bbb681243042a4adc43b3c3b2_1_mwpl_05500201.jpeg"},{"title":"韩主帅:中国和一年前完全不同 称赞球员去中超","date":"2016-07-20 09:56","category":"体育","author_name":"新浪体育","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20160720/20160720095624_0dccb9315af2d7d96f4f41624ecc13a9_1_mwpm_03200403.jpeg","url":"http://mini.eastday.com/mobile/160720095624605.html?qid=juheshuju","thumbnail_pic_s03":"http://06.imgmini.eastday.com/mobile/20160720/20160720095624_0dccb9315af2d7d96f4f41624ecc13a9_1_mwpl_05500201.jpeg"},{"title":"李宁弧2016测评：弹力不减 一体织更出色","date":"2016-07-20 09:56","category":"体育","author_name":"新浪跑步","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20160720/20160720095623_c75d3dbc1ee2feafb091ba2a87868f88_1_mwpm_03200403.jpeg","url":"http://mini.eastday.com/mobile/160720095623628.html?qid=juheshuju","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20160720/20160720095623_c75d3dbc1ee2feafb091ba2a87868f88_1_mwpl_05500201.jpeg"},{"title":"启程!家嫂出征里约奥运 蓝天红T恤美如画","date":"2016-07-20 09:56","category":"体育","author_name":"新浪体育","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20160720/20160720095622_56753bb3c321d172dc75eae9df891d6e_1_mwpm_03200403.jpeg","url":"http://mini.eastday.com/mobile/160720095622064.html?qid=juheshuju","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20160720/20160720095622_56753bb3c321d172dc75eae9df891d6e_1_mwpl_05500201.jpeg"},{"title":"奥地利网球公开赛 梅尔泽本土收获复出首胜","date":"2016-07-20 09:55","category":"体育","author_name":"搜狐体育","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20160720/20160720095557_75a5067437d681937a07937a1553c664_1_mwpm_03200403.jpeg","url":"http://mini.eastday.com/mobile/160720095557061.html?qid=juheshuju","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20160720/20160720095557_75a5067437d681937a07937a1553c664_1_mwpl_05500201.jpeg"},{"title":"五大天才需向齐祖正名 老佛爷不想支票打水漂","date":"2016-07-20 09:55","category":"体育","author_name":"腾讯体育","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20160720/20160720095535_4d3895f9a51c69726a2e15a5fe3399eb_1_mwpm_03200403.jpeg","url":"http://mini.eastday.com/mobile/160720095535374.html?qid=juheshuju","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20160720/20160720095535_4d3895f9a51c69726a2e15a5fe3399eb_1_mwpl_05500201.jpeg"},{"title":"比泰森还狂的一代拳魔，杀妻后在狱中自杀","date":"2016-07-20 09:55","category":"体育","author_name":"东方网","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20160720/20160720095534_95e23439ea1ee5527e1c2e4003fe110d_1_mwpm_03200403.jpeg","url":"http://mini.eastday.com/mobile/160720095534577.html?qid=juheshuju","thumbnail_pic_s03":"http://03.imgmini.eastday.com/mobile/20160720/20160720095534_95e23439ea1ee5527e1c2e4003fe110d_1_mwpl_05500201.jpeg"},{"title":"法国新齐祖亲承100%留队 皇马巴黎这回可歇菜了","date":"2016-07-20 09:53","category":"体育","author_name":"搜狐体育","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20160720/20160720095326_5a743c492de2edc98d64197eb2aefd68_1_mwpm_03200403.jpeg","url":"http://mini.eastday.com/mobile/160720095326135.html?qid=juheshuju","thumbnail_pic_s03":"http://05.imgmini.eastday.com/mobile/20160720/20160720095326_5a743c492de2edc98d64197eb2aefd68_1_mwpl_05500201.jpeg"},{"title":"甜瓜：不介意KD忽视尼克斯 都应接受他的选择","date":"2016-07-20 09:53","category":"体育","author_name":"腾讯体育","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20160720/20160720095310_6270d34959b621aae495dc5429652428_1_mwpm_03200403.jpeg","url":"http://mini.eastday.com/mobile/160720095310229.html?qid=juheshuju","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20160720/20160720095310_6270d34959b621aae495dc5429652428_1_mwpl_05500201.jpeg"},{"title":"3分钟完成一炸一接 缅甸小鲜肉：想参加总决赛","date":"2016-07-20 09:53","category":"体育","author_name":"腾讯体育","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20160720/20160720095309_dc76dee24e05c9a387182eb7419702b3_1_mwpm_03200403.jpeg","url":"http://mini.eastday.com/mobile/160720095309686.html?qid=juheshuju","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20160720/20160720095309_dc76dee24e05c9a387182eb7419702b3_1_mwpl_05500201.jpeg"},{"title":"\"段子手\"郭艾伦晒男篮合照:为啥我帅的那么明显?","date":"2016-07-20 09:52","category":"体育","author_name":"网易体育","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20160720/20160720095233_3e0354517ba2efc04a124af5d6d6d54c_1_mwpm_03200403.jpeg","url":"http://mini.eastday.com/mobile/160720095233309.html?qid=juheshuju","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20160720/20160720095233_3e0354517ba2efc04a124af5d6d6d54c_1_mwpl_05500201.jpeg"},{"title":"提升跑步速度八窍门 合理饮食+跟踪状态要牢记","date":"2016-07-20 09:50","category":"体育","author_name":"新浪跑步","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20160720/20160720095052_656c45f5daa261c11dc48c6db32864d6_1_mwpm_03200403.jpeg","url":"http://mini.eastday.com/mobile/160720095052203.html?qid=juheshuju","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20160720/20160720095052_656c45f5daa261c11dc48c6db32864d6_1_mwpl_05500201.jpeg"},{"title":"默认对伊基出轨?尼克-杨出席活动承认将二度当爹","date":"2016-07-20 09:49","category":"体育","author_name":"网易","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20160720/20160720094958_8070bd34411a782728dcee272e2e6323_1_mwpm_03200403.jpeg","url":"http://mini.eastday.com/mobile/160720094958577.html?qid=juheshuju","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20160720/20160720094958_8070bd34411a782728dcee272e2e6323_1_mwpl_05500201.jpeg"},{"title":"高清：申花备战下轮中超 虹口体育场草皮开始翻修","date":"2016-07-20 09:49","category":"体育","author_name":"人民网-体育频道","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20160720/20160720094927_ecdcc6a21961bad6ee79a09e740a1af6_1_mwpm_03200403.jpeg","url":"http://mini.eastday.com/mobile/160720094927664.html?qid=juheshuju","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20160720/20160720094927_ecdcc6a21961bad6ee79a09e740a1af6_1_mwpl_05500201.jpeg"},{"title":"高清：内马尔领衔巴西国奥队 训练备战里约奥运会","date":"2016-07-20 09:49","category":"体育","author_name":"人民网-体育频道","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20160720/20160720094926_bfe093a38a45243ec769d1253396fef3_1_mwpm_03200403.jpeg","url":"http://mini.eastday.com/mobile/160720094926967.html?qid=juheshuju","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20160720/20160720094926_bfe093a38a45243ec769d1253396fef3_1_mwpl_05500201.jpeg"},{"title":"果岭外推击：采用标准式推击动作 加大上杆幅度","date":"2016-07-20 09:49","category":"体育","author_name":"搜狐体育","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20160720/20160720094916_126d083a99100a27d5029bf91c3d0816_1_mwpm_03200403.jpeg","url":"http://mini.eastday.com/mobile/160720094916418.html?qid=juheshuju","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20160720/20160720094916_126d083a99100a27d5029bf91c3d0816_1_mwpl_05500201.jpeg"},{"title":"张帅斯托瑟收获华盛顿开门红","date":"2016-07-20 09:49","category":"体育","author_name":"搜狐体育","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20160720/20160720094914_d9a1f9d5a82b1e2d5e4ba0d74de480de_1_mwpm_03200403.jpeg","url":"http://mini.eastday.com/mobile/160720094914717.html?qid=juheshuju","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20160720/20160720094914_d9a1f9d5a82b1e2d5e4ba0d74de480de_1_mwpl_05500201.jpeg"},{"title":"九江站老将逆转成主流 师徒三代会师64强","date":"2016-07-20 09:48","category":"体育","author_name":"腾讯体育","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20160720/20160720094829_4d2a8fecc6744b5825e5346521153ca2_1_mwpm_03200403.jpeg","url":"http://mini.eastday.com/mobile/160720094829773.html?qid=juheshuju","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20160720/20160720094829_4d2a8fecc6744b5825e5346521153ca2_1_mwpl_05500201.jpeg"},{"title":"黄博文:广州德比和谐 别的德比火爆因想争\"老大\"","date":"2016-07-20 09:47","category":"体育","author_name":"网易体育","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20160720/20160720094707_fa7b60a4c386b8e039c3a6e555297155_1_mwpm_03200403.jpeg","url":"http://mini.eastday.com/mobile/160720094707784.html?qid=juheshuju","thumbnail_pic_s03":"http://06.imgmini.eastday.com/mobile/20160720/20160720094707_fa7b60a4c386b8e039c3a6e555297155_1_mwpl_05500201.jpeg"},{"title":"四名南海健儿将出征里约","date":"2016-07-20 09:46","category":"体育","author_name":"珠江时报","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20160720/20160720094617_dbfd76f35fa4cfc0cfbc502d5e86e641_1_mwpm_03200403.jpeg","url":"http://mini.eastday.com/mobile/160720094617071.html?qid=juheshuju","thumbnail_pic_s03":"http://03.imgmini.eastday.com/mobile/20160720/20160720094617_dbfd76f35fa4cfc0cfbc502d5e86e641_1_mwpl_05500201.jpeg"},{"title":"杜兰特自曝决定后在家躲了两天 害怕出门被车撞","date":"2016-07-20 09:45","category":"体育","author_name":"搜狐体育","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20160720/20160720094559_ef13686d54a23747f98f64929ba6bcf0_1_mwpm_03200403.png","url":"http://mini.eastday.com/mobile/160720094559869.html?qid=juheshuju","thumbnail_pic_s03":"http://08.imgmini.eastday.com/mobile/20160720/20160720094559_ef13686d54a23747f98f64929ba6bcf0_1_mwpl_05500201.png"},{"title":"费德勒忆奥运：悉尼恋上米尔卡 北京获瓦林卡鼓励","date":"2016-07-20 09:45","category":"体育","author_name":"新浪体育","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20160720/20160720094518_c96c6886941e254cfe87baedb978b2db_1_mwpm_03200403.jpeg","url":"http://mini.eastday.com/mobile/160720094518708.html?qid=juheshuju","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20160720/20160720094518_c96c6886941e254cfe87baedb978b2db_1_mwpl_05500201.jpeg"},{"title":"阿森纳新队长定了！世界冠军名将 击败切赫上位","date":"2016-07-20 09:45","category":"体育","author_name":"新浪体育","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20160720/20160720094518_0b485137a50fff3b9f003064564bb695_1_mwpm_03200403.jpeg","url":"http://mini.eastday.com/mobile/160720094518224.html?qid=juheshuju","thumbnail_pic_s03":"http://08.imgmini.eastday.com/mobile/20160720/20160720094518_0b485137a50fff3b9f003064564bb695_1_mwpl_05500201.jpeg"},{"title":"今夏45%签约合同被高估 火箭新援溢价榜排第一","date":"2016-07-20 09:43","category":"体育","author_name":"ESPN","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20160720/20160720094354_7e4a3c47ea73f343228ba5e460d623d8_1_mwpm_03200403.png","url":"http://mini.eastday.com/mobile/160720094354794.html?qid=juheshuju","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20160720/20160720094354_7e4a3c47ea73f343228ba5e460d623d8_1_mwpl_05500201.png"},{"title":"何超大晒腹肌人鱼线 戏言拿冠军就买iphone","date":"2016-07-20 09:43","category":"体育","author_name":"腾讯体育","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20160720/20160720094352_43ebfc16b1fb737715b84a38e25dc11d_1_mwpm_03200403.jpeg","url":"http://mini.eastday.com/mobile/160720094352710.html?qid=juheshuju","thumbnail_pic_s03":"http://03.imgmini.eastday.com/mobile/20160720/20160720094352_43ebfc16b1fb737715b84a38e25dc11d_1_mwpl_05500201.jpeg"},{"title":"拜仁王牌:要用三冠鞭策球队 为萨默尔离开遗憾","date":"2016-07-20 09:43","category":"体育","author_name":"华体网","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20160720/20160720094311_8e3d92ad89d41bc336d4b2f71c950aae_1_mwpm_03200403.jpeg","url":"http://mini.eastday.com/mobile/160720094311519.html?qid=juheshuju","thumbnail_pic_s03":"http://03.imgmini.eastday.com/mobile/20160720/20160720094311_8e3d92ad89d41bc336d4b2f71c950aae_1_mwpl_05500201.jpeg"},{"title":"张玉宁：一个不为钱回国的\u201c富二代\u201d","date":"2016-07-20 09:42","category":"体育","author_name":"央广网体育","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20160720/20160720094201_a4d9cddbd76d0a13f4801025a9e4bf8d_1_mwpm_03200403.jpeg","url":"http://mini.eastday.com/mobile/160720094201621.html?qid=juheshuju","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20160720/20160720094201_a4d9cddbd76d0a13f4801025a9e4bf8d_1_mwpl_05500201.jpeg"},{"title":"拉维奇:努力恢复盼早返回球场 希望你们一切都好","date":"2016-07-20 09:41","category":"体育","author_name":"网易体育","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20160720/20160720094115_78630c2502071adb5b66f25c01ddb2b8_1_mwpm_03200403.jpeg","url":"http://mini.eastday.com/mobile/160720094115801.html?qid=juheshuju","thumbnail_pic_s03":"http://08.imgmini.eastday.com/mobile/20160720/20160720094115_78630c2502071adb5b66f25c01ddb2b8_1_mwpl_05500201.jpeg"},{"title":"欧文：将科比视为偶像 他和勒布朗是生涯两导师","date":"2016-07-20 09:41","category":"体育","author_name":"搜狐","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20160720/20160720094115_7f01da72a1a08f2c889c2d0d027c66da_1_mwpm_03200403.jpeg","url":"http://mini.eastday.com/mobile/160720094115691.html?qid=juheshuju","thumbnail_pic_s03":"http://05.imgmini.eastday.com/mobile/20160720/20160720094115_7f01da72a1a08f2c889c2d0d027c66da_1_mwpl_05500201.jpeg"},{"title":"巴萨前队长广告词引争议 加独者PK西班牙人","date":"2016-07-20 09:40","category":"体育","author_name":"华体网综合体育","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20160720/20160720094017_cde44cd4718b1f4bfc62ce8cfe131a43_1_mwpm_03200403.jpeg","url":"http://mini.eastday.com/mobile/160720094017942.html?qid=juheshuju","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20160720/20160720094017_cde44cd4718b1f4bfc62ce8cfe131a43_1_mwpl_05500201.jpeg"},{"title":"美媒为勇士推荐第15人:都是熟人 第一位竟是他","date":"2016-07-20 09:40","category":"体育","author_name":"新浪体育","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20160720/20160720094010_0ed4629215b9f73bf8db6f610497c6f0_1_mwpm_03200403.jpeg","url":"http://mini.eastday.com/mobile/160720094010539.html?qid=juheshuju","thumbnail_pic_s03":"http://05.imgmini.eastday.com/mobile/20160720/20160720094010_0ed4629215b9f73bf8db6f610497c6f0_1_mwpl_05500201.jpeg"}]}
     * error_code : 0
     */

    private String reason;
    /**
     * stat : 1
     * data : [{"title":"悲剧！佛山民间篮球赛 一球员替补席观战时猝死","date":"2016-07-20 10:02","category":"体育","author_name":"凤凰体育","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20160720/20160720100200_e5e54ee43acab7cde9deae0a4ad81d02_1_mwpm_03200403.jpeg","url":"http://mini.eastday.com/mobile/160720100200176.html?qid=juheshuju","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20160720/20160720100200_e5e54ee43acab7cde9deae0a4ad81d02_1_mwpl_05500201.jpeg"},{"title":"蓝军为后防新领袖拒德甲劲旅报价 曾入选赛季最佳","date":"2016-07-20 10:01","category":"体育","author_name":"凤凰体育","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20160720/20160720100159_7664a50a7d0cfcaf29a9b8587579e6d7_1_mwpm_03200403.jpeg","url":"http://mini.eastday.com/mobile/160720100159452.html?qid=juheshuju","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20160720/20160720100159_7664a50a7d0cfcaf29a9b8587579e6d7_1_mwpl_05500201.jpeg"},{"title":"巴博萨欲助太阳进季后赛 仍穿19号致敬拉贾-贝尔","date":"2016-07-20 10:01","category":"体育","author_name":"网易体育","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20160720/20160720100156_5250216fa462ef28e05020a82e4175db_1_mwpm_03200403.jpeg","url":"http://mini.eastday.com/mobile/160720100156665.html?qid=juheshuju","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20160720/20160720100156_5250216fa462ef28e05020a82e4175db_1_mwpl_05500201.jpeg"},{"title":"保罗自曝给KD转会建议:这是你生涯的大好转机","date":"2016-07-20 10:00","category":"体育","author_name":"东方网","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20160720/20160720100057_2bcfd279c8f4b3180524650d958222fa_1_mwpm_03200403.jpeg","url":"http://mini.eastday.com/mobile/160720100057326.html?qid=juheshuju","thumbnail_pic_s03":"http://05.imgmini.eastday.com/mobile/20160720/20160720100057_2bcfd279c8f4b3180524650d958222fa_1_mwpl_05500201.jpeg"},{"title":"玲听海风：第一章 传承还是遗产","date":"2016-07-20 09:59","category":"体育","author_name":"北京时间体育","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20160720/20160720095936_fa1f4576e417ae4fdd6645e7a48347da_1_mwpm_03200403.jpeg","url":"http://mini.eastday.com/mobile/160720095936833.html?qid=juheshuju","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20160720/20160720095936_fa1f4576e417ae4fdd6645e7a48347da_1_mwpl_05500201.jpeg"},{"title":"意新帅：佩莱小心蹈迪亚曼蒂覆辙 去中超只剩钱","date":"2016-07-20 09:59","category":"体育","author_name":"搜狐体育","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20160720/20160720095909_105cbe5c0d1d930e788c5fdcab6e1e63_1_mwpm_03200403.jpeg","url":"http://mini.eastday.com/mobile/160720095909150.html?qid=juheshuju","thumbnail_pic_s03":"http://08.imgmini.eastday.com/mobile/20160720/20160720095909_105cbe5c0d1d930e788c5fdcab6e1e63_1_mwpl_05500201.jpeg"},{"title":"李楠:男篮所在组是最强组 形势不乐观力争佳绩","date":"2016-07-20 09:58","category":"体育","author_name":"中华网","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20160720/20160720095815_93d23639b081618e0428c8fa8d5c5aad_1_mwpm_03200403.jpeg","url":"http://mini.eastday.com/mobile/160720095815551.html?qid=juheshuju","thumbnail_pic_s03":"http://03.imgmini.eastday.com/mobile/20160720/20160720095815_93d23639b081618e0428c8fa8d5c5aad_1_mwpl_05500201.jpeg"},{"title":"意大利主帅：佩莱还有机会 别成下个迪亚曼蒂","date":"2016-07-20 09:57","category":"体育","author_name":"腾讯体育","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20160720/20160720095753_32d3732b75f6d979ba3a1f2e9da7167b_1_mwpm_03200403.jpeg","url":"http://mini.eastday.com/mobile/160720095753010.html?qid=juheshuju","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20160720/20160720095753_32d3732b75f6d979ba3a1f2e9da7167b_1_mwpl_05500201.jpeg"},{"title":"西媒:宁泽涛经波折将战里约 他是中国全民偶像","date":"2016-07-20 09:57","category":"体育","author_name":"腾讯体育","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20160720/20160720095751_4c36c2ded3d084b8a942df8a911eae00_1_mwpm_03200403.jpeg","url":"http://mini.eastday.com/mobile/160720095751582.html?qid=juheshuju","thumbnail_pic_s03":"http://05.imgmini.eastday.com/mobile/20160720/20160720095751_4c36c2ded3d084b8a942df8a911eae00_1_mwpl_05500201.jpeg"},{"title":"欧文：曾经是杜兰特球迷 国家队经历让人难忘","date":"2016-07-20 09:57","category":"体育","author_name":"腾讯体育","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20160720/20160720095751_9c39145bbb681243042a4adc43b3c3b2_1_mwpm_03200403.jpeg","url":"http://mini.eastday.com/mobile/160720095751099.html?qid=juheshuju","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20160720/20160720095751_9c39145bbb681243042a4adc43b3c3b2_1_mwpl_05500201.jpeg"},{"title":"韩主帅:中国和一年前完全不同 称赞球员去中超","date":"2016-07-20 09:56","category":"体育","author_name":"新浪体育","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20160720/20160720095624_0dccb9315af2d7d96f4f41624ecc13a9_1_mwpm_03200403.jpeg","url":"http://mini.eastday.com/mobile/160720095624605.html?qid=juheshuju","thumbnail_pic_s03":"http://06.imgmini.eastday.com/mobile/20160720/20160720095624_0dccb9315af2d7d96f4f41624ecc13a9_1_mwpl_05500201.jpeg"},{"title":"李宁弧2016测评：弹力不减 一体织更出色","date":"2016-07-20 09:56","category":"体育","author_name":"新浪跑步","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20160720/20160720095623_c75d3dbc1ee2feafb091ba2a87868f88_1_mwpm_03200403.jpeg","url":"http://mini.eastday.com/mobile/160720095623628.html?qid=juheshuju","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20160720/20160720095623_c75d3dbc1ee2feafb091ba2a87868f88_1_mwpl_05500201.jpeg"},{"title":"启程!家嫂出征里约奥运 蓝天红T恤美如画","date":"2016-07-20 09:56","category":"体育","author_name":"新浪体育","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20160720/20160720095622_56753bb3c321d172dc75eae9df891d6e_1_mwpm_03200403.jpeg","url":"http://mini.eastday.com/mobile/160720095622064.html?qid=juheshuju","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20160720/20160720095622_56753bb3c321d172dc75eae9df891d6e_1_mwpl_05500201.jpeg"},{"title":"奥地利网球公开赛 梅尔泽本土收获复出首胜","date":"2016-07-20 09:55","category":"体育","author_name":"搜狐体育","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20160720/20160720095557_75a5067437d681937a07937a1553c664_1_mwpm_03200403.jpeg","url":"http://mini.eastday.com/mobile/160720095557061.html?qid=juheshuju","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20160720/20160720095557_75a5067437d681937a07937a1553c664_1_mwpl_05500201.jpeg"},{"title":"五大天才需向齐祖正名 老佛爷不想支票打水漂","date":"2016-07-20 09:55","category":"体育","author_name":"腾讯体育","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20160720/20160720095535_4d3895f9a51c69726a2e15a5fe3399eb_1_mwpm_03200403.jpeg","url":"http://mini.eastday.com/mobile/160720095535374.html?qid=juheshuju","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20160720/20160720095535_4d3895f9a51c69726a2e15a5fe3399eb_1_mwpl_05500201.jpeg"},{"title":"比泰森还狂的一代拳魔，杀妻后在狱中自杀","date":"2016-07-20 09:55","category":"体育","author_name":"东方网","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20160720/20160720095534_95e23439ea1ee5527e1c2e4003fe110d_1_mwpm_03200403.jpeg","url":"http://mini.eastday.com/mobile/160720095534577.html?qid=juheshuju","thumbnail_pic_s03":"http://03.imgmini.eastday.com/mobile/20160720/20160720095534_95e23439ea1ee5527e1c2e4003fe110d_1_mwpl_05500201.jpeg"},{"title":"法国新齐祖亲承100%留队 皇马巴黎这回可歇菜了","date":"2016-07-20 09:53","category":"体育","author_name":"搜狐体育","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20160720/20160720095326_5a743c492de2edc98d64197eb2aefd68_1_mwpm_03200403.jpeg","url":"http://mini.eastday.com/mobile/160720095326135.html?qid=juheshuju","thumbnail_pic_s03":"http://05.imgmini.eastday.com/mobile/20160720/20160720095326_5a743c492de2edc98d64197eb2aefd68_1_mwpl_05500201.jpeg"},{"title":"甜瓜：不介意KD忽视尼克斯 都应接受他的选择","date":"2016-07-20 09:53","category":"体育","author_name":"腾讯体育","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20160720/20160720095310_6270d34959b621aae495dc5429652428_1_mwpm_03200403.jpeg","url":"http://mini.eastday.com/mobile/160720095310229.html?qid=juheshuju","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20160720/20160720095310_6270d34959b621aae495dc5429652428_1_mwpl_05500201.jpeg"},{"title":"3分钟完成一炸一接 缅甸小鲜肉：想参加总决赛","date":"2016-07-20 09:53","category":"体育","author_name":"腾讯体育","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20160720/20160720095309_dc76dee24e05c9a387182eb7419702b3_1_mwpm_03200403.jpeg","url":"http://mini.eastday.com/mobile/160720095309686.html?qid=juheshuju","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20160720/20160720095309_dc76dee24e05c9a387182eb7419702b3_1_mwpl_05500201.jpeg"},{"title":"\"段子手\"郭艾伦晒男篮合照:为啥我帅的那么明显?","date":"2016-07-20 09:52","category":"体育","author_name":"网易体育","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20160720/20160720095233_3e0354517ba2efc04a124af5d6d6d54c_1_mwpm_03200403.jpeg","url":"http://mini.eastday.com/mobile/160720095233309.html?qid=juheshuju","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20160720/20160720095233_3e0354517ba2efc04a124af5d6d6d54c_1_mwpl_05500201.jpeg"},{"title":"提升跑步速度八窍门 合理饮食+跟踪状态要牢记","date":"2016-07-20 09:50","category":"体育","author_name":"新浪跑步","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20160720/20160720095052_656c45f5daa261c11dc48c6db32864d6_1_mwpm_03200403.jpeg","url":"http://mini.eastday.com/mobile/160720095052203.html?qid=juheshuju","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20160720/20160720095052_656c45f5daa261c11dc48c6db32864d6_1_mwpl_05500201.jpeg"},{"title":"默认对伊基出轨?尼克-杨出席活动承认将二度当爹","date":"2016-07-20 09:49","category":"体育","author_name":"网易","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20160720/20160720094958_8070bd34411a782728dcee272e2e6323_1_mwpm_03200403.jpeg","url":"http://mini.eastday.com/mobile/160720094958577.html?qid=juheshuju","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20160720/20160720094958_8070bd34411a782728dcee272e2e6323_1_mwpl_05500201.jpeg"},{"title":"高清：申花备战下轮中超 虹口体育场草皮开始翻修","date":"2016-07-20 09:49","category":"体育","author_name":"人民网-体育频道","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20160720/20160720094927_ecdcc6a21961bad6ee79a09e740a1af6_1_mwpm_03200403.jpeg","url":"http://mini.eastday.com/mobile/160720094927664.html?qid=juheshuju","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20160720/20160720094927_ecdcc6a21961bad6ee79a09e740a1af6_1_mwpl_05500201.jpeg"},{"title":"高清：内马尔领衔巴西国奥队 训练备战里约奥运会","date":"2016-07-20 09:49","category":"体育","author_name":"人民网-体育频道","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20160720/20160720094926_bfe093a38a45243ec769d1253396fef3_1_mwpm_03200403.jpeg","url":"http://mini.eastday.com/mobile/160720094926967.html?qid=juheshuju","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20160720/20160720094926_bfe093a38a45243ec769d1253396fef3_1_mwpl_05500201.jpeg"},{"title":"果岭外推击：采用标准式推击动作 加大上杆幅度","date":"2016-07-20 09:49","category":"体育","author_name":"搜狐体育","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20160720/20160720094916_126d083a99100a27d5029bf91c3d0816_1_mwpm_03200403.jpeg","url":"http://mini.eastday.com/mobile/160720094916418.html?qid=juheshuju","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20160720/20160720094916_126d083a99100a27d5029bf91c3d0816_1_mwpl_05500201.jpeg"},{"title":"张帅斯托瑟收获华盛顿开门红","date":"2016-07-20 09:49","category":"体育","author_name":"搜狐体育","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20160720/20160720094914_d9a1f9d5a82b1e2d5e4ba0d74de480de_1_mwpm_03200403.jpeg","url":"http://mini.eastday.com/mobile/160720094914717.html?qid=juheshuju","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20160720/20160720094914_d9a1f9d5a82b1e2d5e4ba0d74de480de_1_mwpl_05500201.jpeg"},{"title":"九江站老将逆转成主流 师徒三代会师64强","date":"2016-07-20 09:48","category":"体育","author_name":"腾讯体育","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20160720/20160720094829_4d2a8fecc6744b5825e5346521153ca2_1_mwpm_03200403.jpeg","url":"http://mini.eastday.com/mobile/160720094829773.html?qid=juheshuju","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20160720/20160720094829_4d2a8fecc6744b5825e5346521153ca2_1_mwpl_05500201.jpeg"},{"title":"黄博文:广州德比和谐 别的德比火爆因想争\"老大\"","date":"2016-07-20 09:47","category":"体育","author_name":"网易体育","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20160720/20160720094707_fa7b60a4c386b8e039c3a6e555297155_1_mwpm_03200403.jpeg","url":"http://mini.eastday.com/mobile/160720094707784.html?qid=juheshuju","thumbnail_pic_s03":"http://06.imgmini.eastday.com/mobile/20160720/20160720094707_fa7b60a4c386b8e039c3a6e555297155_1_mwpl_05500201.jpeg"},{"title":"四名南海健儿将出征里约","date":"2016-07-20 09:46","category":"体育","author_name":"珠江时报","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20160720/20160720094617_dbfd76f35fa4cfc0cfbc502d5e86e641_1_mwpm_03200403.jpeg","url":"http://mini.eastday.com/mobile/160720094617071.html?qid=juheshuju","thumbnail_pic_s03":"http://03.imgmini.eastday.com/mobile/20160720/20160720094617_dbfd76f35fa4cfc0cfbc502d5e86e641_1_mwpl_05500201.jpeg"},{"title":"杜兰特自曝决定后在家躲了两天 害怕出门被车撞","date":"2016-07-20 09:45","category":"体育","author_name":"搜狐体育","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20160720/20160720094559_ef13686d54a23747f98f64929ba6bcf0_1_mwpm_03200403.png","url":"http://mini.eastday.com/mobile/160720094559869.html?qid=juheshuju","thumbnail_pic_s03":"http://08.imgmini.eastday.com/mobile/20160720/20160720094559_ef13686d54a23747f98f64929ba6bcf0_1_mwpl_05500201.png"},{"title":"费德勒忆奥运：悉尼恋上米尔卡 北京获瓦林卡鼓励","date":"2016-07-20 09:45","category":"体育","author_name":"新浪体育","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20160720/20160720094518_c96c6886941e254cfe87baedb978b2db_1_mwpm_03200403.jpeg","url":"http://mini.eastday.com/mobile/160720094518708.html?qid=juheshuju","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20160720/20160720094518_c96c6886941e254cfe87baedb978b2db_1_mwpl_05500201.jpeg"},{"title":"阿森纳新队长定了！世界冠军名将 击败切赫上位","date":"2016-07-20 09:45","category":"体育","author_name":"新浪体育","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20160720/20160720094518_0b485137a50fff3b9f003064564bb695_1_mwpm_03200403.jpeg","url":"http://mini.eastday.com/mobile/160720094518224.html?qid=juheshuju","thumbnail_pic_s03":"http://08.imgmini.eastday.com/mobile/20160720/20160720094518_0b485137a50fff3b9f003064564bb695_1_mwpl_05500201.jpeg"},{"title":"今夏45%签约合同被高估 火箭新援溢价榜排第一","date":"2016-07-20 09:43","category":"体育","author_name":"ESPN","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20160720/20160720094354_7e4a3c47ea73f343228ba5e460d623d8_1_mwpm_03200403.png","url":"http://mini.eastday.com/mobile/160720094354794.html?qid=juheshuju","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20160720/20160720094354_7e4a3c47ea73f343228ba5e460d623d8_1_mwpl_05500201.png"},{"title":"何超大晒腹肌人鱼线 戏言拿冠军就买iphone","date":"2016-07-20 09:43","category":"体育","author_name":"腾讯体育","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20160720/20160720094352_43ebfc16b1fb737715b84a38e25dc11d_1_mwpm_03200403.jpeg","url":"http://mini.eastday.com/mobile/160720094352710.html?qid=juheshuju","thumbnail_pic_s03":"http://03.imgmini.eastday.com/mobile/20160720/20160720094352_43ebfc16b1fb737715b84a38e25dc11d_1_mwpl_05500201.jpeg"},{"title":"拜仁王牌:要用三冠鞭策球队 为萨默尔离开遗憾","date":"2016-07-20 09:43","category":"体育","author_name":"华体网","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20160720/20160720094311_8e3d92ad89d41bc336d4b2f71c950aae_1_mwpm_03200403.jpeg","url":"http://mini.eastday.com/mobile/160720094311519.html?qid=juheshuju","thumbnail_pic_s03":"http://03.imgmini.eastday.com/mobile/20160720/20160720094311_8e3d92ad89d41bc336d4b2f71c950aae_1_mwpl_05500201.jpeg"},{"title":"张玉宁：一个不为钱回国的\u201c富二代\u201d","date":"2016-07-20 09:42","category":"体育","author_name":"央广网体育","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20160720/20160720094201_a4d9cddbd76d0a13f4801025a9e4bf8d_1_mwpm_03200403.jpeg","url":"http://mini.eastday.com/mobile/160720094201621.html?qid=juheshuju","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20160720/20160720094201_a4d9cddbd76d0a13f4801025a9e4bf8d_1_mwpl_05500201.jpeg"},{"title":"拉维奇:努力恢复盼早返回球场 希望你们一切都好","date":"2016-07-20 09:41","category":"体育","author_name":"网易体育","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20160720/20160720094115_78630c2502071adb5b66f25c01ddb2b8_1_mwpm_03200403.jpeg","url":"http://mini.eastday.com/mobile/160720094115801.html?qid=juheshuju","thumbnail_pic_s03":"http://08.imgmini.eastday.com/mobile/20160720/20160720094115_78630c2502071adb5b66f25c01ddb2b8_1_mwpl_05500201.jpeg"},{"title":"欧文：将科比视为偶像 他和勒布朗是生涯两导师","date":"2016-07-20 09:41","category":"体育","author_name":"搜狐","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20160720/20160720094115_7f01da72a1a08f2c889c2d0d027c66da_1_mwpm_03200403.jpeg","url":"http://mini.eastday.com/mobile/160720094115691.html?qid=juheshuju","thumbnail_pic_s03":"http://05.imgmini.eastday.com/mobile/20160720/20160720094115_7f01da72a1a08f2c889c2d0d027c66da_1_mwpl_05500201.jpeg"},{"title":"巴萨前队长广告词引争议 加独者PK西班牙人","date":"2016-07-20 09:40","category":"体育","author_name":"华体网综合体育","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20160720/20160720094017_cde44cd4718b1f4bfc62ce8cfe131a43_1_mwpm_03200403.jpeg","url":"http://mini.eastday.com/mobile/160720094017942.html?qid=juheshuju","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20160720/20160720094017_cde44cd4718b1f4bfc62ce8cfe131a43_1_mwpl_05500201.jpeg"},{"title":"美媒为勇士推荐第15人:都是熟人 第一位竟是他","date":"2016-07-20 09:40","category":"体育","author_name":"新浪体育","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20160720/20160720094010_0ed4629215b9f73bf8db6f610497c6f0_1_mwpm_03200403.jpeg","url":"http://mini.eastday.com/mobile/160720094010539.html?qid=juheshuju","thumbnail_pic_s03":"http://05.imgmini.eastday.com/mobile/20160720/20160720094010_0ed4629215b9f73bf8db6f610497c6f0_1_mwpl_05500201.jpeg"}]
     */

    private ResultBean result;
    private int error_code;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public static class ResultBean implements Serializable {
        private String stat;
        /**
         * title : 悲剧！佛山民间篮球赛 一球员替补席观战时猝死
         * date : 2016-07-20 10:02
         * category : 体育
         * author_name : 凤凰体育
         * thumbnail_pic_s : http://09.imgmini.eastday.com/mobile/20160720/20160720100200_e5e54ee43acab7cde9deae0a4ad81d02_1_mwpm_03200403.jpeg
         * url : http://mini.eastday.com/mobile/160720100200176.html?qid=juheshuju
         * thumbnail_pic_s03 : http://09.imgmini.eastday.com/mobile/20160720/20160720100200_e5e54ee43acab7cde9deae0a4ad81d02_1_mwpl_05500201.jpeg
         */

        private List<DataBean> data;

        public String getStat() {
            return stat;
        }

        public void setStat(String stat) {
            this.stat = stat;
        }

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public static class DataBean implements Serializable {
            private String title;
            private String date;
            private String category;
            private String author_name;
            private String thumbnail_pic_s;
            private String url;
            private String thumbnail_pic_s03;

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getCategory() {
                return category;
            }

            public void setCategory(String category) {
                this.category = category;
            }

            public String getAuthor_name() {
                return author_name;
            }

            public void setAuthor_name(String author_name) {
                this.author_name = author_name;
            }

            public String getThumbnail_pic_s() {
                return thumbnail_pic_s;
            }

            public void setThumbnail_pic_s(String thumbnail_pic_s) {
                this.thumbnail_pic_s = thumbnail_pic_s;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getThumbnail_pic_s03() {
                return thumbnail_pic_s03;
            }

            public void setThumbnail_pic_s03(String thumbnail_pic_s03) {
                this.thumbnail_pic_s03 = thumbnail_pic_s03;
            }
        }
    }
}
