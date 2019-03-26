package cn.tju.howie;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

/**
 * @author Howie Lu
 * @version Created at 2019/03/26
 */

@RunWith(Parameterized.class)
public class TestSCSJava {
    private WebDriver driver;
    private String baseUrl;
    private String studentId; //3016218091
    private String password;
    private String studentName;
    private String studentGit;

    public TestSCSJava(String studentId, String studentName, String studentGit){
        this.studentId = studentId;
        this.password = studentId.substring(4);
        this.studentName = studentName;
        this.studentGit = studentGit;
    }

    @Before
    public void setUp() throws Exception {
        String driverPath = System.getProperty("user.dir") + "/src/main/resources/driver/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        // set headless
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--disable-gpu");
        driver = new ChromeDriver(options);
        baseUrl = "http://121.193.130.195:8800/login";
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getData(){
        return Arrays.asList(new Object[][]{
                {"3016218051", "邓杰", "https://github.com/popboykingdjko"},
                {"3016218052", "董小璇", "https://github.com/xiaoxuaoj"},
                {"3016218053", "范立水", "https://github.com/nbdfls"},
                {"3016218054", "黄逸群", "https://github.com/hyqzz1"},
                {"3016218055", "霍欣芷", ""},
                {"3016218056", "李陈", "https://github.com/FBIbaby"},
                {"3016218057", "李今", "https://github.com/riginAI/test"},
                {"3016218058", "李凯", "https://github.com/likai3016218058"},
                {"3016218059", "李亚康", "https://github.com/forAragaki/Software-Testing.git"},
                {"3016218060", "刘崇玮", "https://github.com/liuchongwei1998"},
                {"3016218061", "刘岳森", "https://github.com/liuyuesen"},
                {"3016218062", "楼林", "https://github.com/loulin206"},
                {"3016218063", "彭昱菡", "https://github.com/acan777"},
                {"3016218064", "石善炜", "https://github.com/Winbeeone/Hello-GitHub"},
                {"3016218065", "唐颂", "https://github.com/tangsongTJU"},
                {"3016218066", "万子航", "https://github.com/LITTLEEEEE/st.git"},
                {"3016218067", "王晨", "https://github.com/WangChen0902"},
                {"3016218068", "王冠", "https://github.com/skye0207"},
                {"3016218069", "王磊", "https://github.com/wanglei201810/HHH.git"},
                {"3016218070", "文健玮", ""},
                {"3016218072", "熊清鸥", "https://github.com/Panda216"},
                {"3016218073", "许炳秋", "https://github.com/AQITF/software-testing-course"},
                {"3016218075", "许致远", "https://github.com/Tyrusmacv"},
                {"3016218076", "张聪", "https://github.com/Tyrusmacv"},
                {"3016218077", "张凯炫", "https://github.com/DanielKZhang"},
                {"3016218078", "邹其锋", "https://gitee.com/zqfgly"},
                {"3016230028", "夏子霞", "https://github.com/XiaZiXia"},
                {"3016204130", "樊鹏", ""},
                {"3016218079", "白钰清", ""},
                {"3016218080", "蔡阳阳", "https://github.com/cyytju"},
                {"3016218081", "陈健", ""},
                {"3016218083", "傅淏", "https://github.com/HaoFuTju"},
                {"3016218084", "勾子懿", "https://github.com/Ziyiiii"},
                {"3016218085", "郭培溟", "https://github.com/guopeiming"},
                {"3016218086", "侯钦瀚", ""},
                {"3016218087", "李晓鹏", "https://github.com/brightknight177"},
                {"3016218088", "李志杰", "https://github.com/zhijielee"},
                {"3016218089", "刘美华", "https://github.com/guguguzi"},
                {"3016218090", "刘奕男", "https://github.com/EchoLiuYinan"},
                {"3016218091", "卢昊", "https://github.com/iiTachi/"},
                {"3016218092", "蒙扬", ""},
                {"3016218093", "欧阳毅铮", "https://github.com/SouperO"},
                {"3016218094", "丘岳华", "https://github.com/qyhxxx"},
                {"3016218096", "孙重阳", "https://github.com/SunCubeIsMyID"},
                {"3016218097", "王春力", "https://github.com/passerw"},
                {"3016218098", "王天", "https://github.com/old-yellow"},
                {"3016218099", "王一博", "https://github.com/yibowang98"},
                {"3016218100", "魏锰", "https://github.com/Landy0524"},
                {"3016218101", "曾晓东", "https://github.com/nkaccounting"},
                {"3016218102", "张程奕", "https://github.com/PlatinumYi"},
                {"3016218103", "张凯", "https://github.com/zk990202"},
                {"3016218104", "张蔚珩", "https://github.com/Zwh0508"},
                {"3016218105", "张颖异", "https://github.com/newyingyi"},
                {"3016218106", "赵家琛", "https://github.com/uareagay"},
                {"3016218107", "钟丽", "https://github.com/LeilaniZ"},
                {"3016204310", "何书豪", "https://github.com/hshsilver/softwaretest"},
                {"3016207516", "刘梓璇", ""},
                {"3016218108", "蔡晴", "https://github.com/Barbra0613"},
                {"3016218109", "陈诺", "https://github.com/Nicole1772"},
                {"3016218110", "陈森林", "https://github.com/csl784513390"},
                {"3016218111", "陈子豪", "https://github.com/czhxbz"},
                {"3016218112", "崔歌", "https://github.com/whyNotwh"},
                {"3016218113", "高文腾", "https://github.com/tjugwt"},
                {"3016218114", "葛坦", "https://github.com/tjugwt"},
                {"3016218115", "胡博", "https://github.com/BoHuyyy"},
                {"3016218116", "黄兴宇", "https://github.com/mangoSteve"},
                {"3016218117", "季可琛", "https://github.com/mangoSteve"},
                {"3016218118", "季杨盛", "https://github.com/AndrewJYS"},
                {"3016218119", "李鹏华", "https://github.com/liphcpp"},
                {"3016218120", "李峙钢", "https://github.com/tju-lzg"},
                {"3016218121", "林然", "https://github.com/Nfboys"},
                {"3016218122", "吕勇梁", "https://github.com/tcklll/software-testing.git"},
                {"3016218123", "马昊阳", "https://github.com/MHYpony"},
                {"3016218124", "孟繁博", "https://github.com/FANBoMeng3016218124/swTest.git"},
                {"3016218125", "王惠民", "https://github.com/tjwhm"},
                {"3016218126", "王宇玄", "https://github.com/hnwyx/software-testing"},
                {"3016218127", "王怡婷", "https://github.com/wwwwangyiting"},
                {"3016218128", "肖业凡", "https://github.com/HNSHongTian/SoftwareTesting"},
                {"3016218129", "许凌涵", "https://github.com/linghanxu-tju/software_testing.git"},
                {"3016218130", "杨旺", "https://github.com/YWlancer"},
                {"3016218131", "张嘉芮", "https://github.com/oikawamomo/software_test"},
                {"3016218133", "赵健", "https://github.com/ZJ921"},
                {"3016218134", "赵艺茹", "https://github.com/zzzyyyrrr"},
                {"3016218135", "窦淑洁", "https://github.com/tjudoubi"},
                {"3014218120", "李明", "https://github.com/SoSoSorry"},
                {"3016218136", "艾孜合尔·哈木提", "https://github.com/users/azzr997/projects/1"},
                {"3016218137", "范林峰", "https://github.com/SryTo/SoftwareTesting.git"},
                {"3016218138", "冯晴", "https://github.com/STHARUKI"},
                {"3016218139", "郭睿", "https://github.com/skadoodleR"},
                {"3016218140", "郭皓华", "https://github.com/Potmon/STT2016.git"},
                {"3016218141", "何雨璇", "https://github.com/everlastingstars"},
                {"3016218142", "加莎热提·买买提依明", "https://github.com/Lothric19"},
                {"3016218143", "李培城", "https://github.com/bxsj/"},
                {"3016218144", "李书瀚", "https://github.com/0-Avalon-0"},
                {"3016218145", "李文旭", "https://github.com/mssjliwenxu"},
                {"3016218146", "梁哲粼", "https://github.com/MaoMaoChina"},
                {"3016218147", "刘春阳", "https://github.com/LiuChunY"},
                {"3016218148", "刘智", "https://github.com/liuzhidemaomao"},
                {"3016218149", "娄宇欣", "https://github.com/Lou11300306?tab=projects"},
                {"3016218150", "马力", "https://github.com/Horsepower8888"},
                {"3016218151", "潘芳旭", "https://github.com/Skypfx/softwareTesting"},
                {"3016218152", "石晓霖", "https://github.com/colindying"},
                {"3016218153", "史丹阳", "https://github.com/htmmd27"},
                {"3016218154", "史鹏", "https://github.com/tjuspAIC/Software-Testing"},
                {"3016218155", "孙玮", "https://github.com/Vincent-Sun"},
                {"3016218156", "谭淮联", "https://github.com/980801"},
                {"3016218157", "邢桢", "https://github.com/ChenHsing"},
                {"3016218158", "杨猛", "https://github.com/yangmeng19980420"},
                {"3016218159", "张环禹", "https://github.com/Ives66"},
                {"3016218160", "张煌", "https://github.com/zhuang12/SoftwareTest.git"},
                {"3016218161", "张亚文", "https://github.com/michellezyw"},
                {"3016218162", "周菁涛", "https://github.com/Cyphexl"},
                {"3016218163", "朱梓毓", "https://github.com/lazygirlyu/homework"},
                {"3016218164", "祝晶晶", "https://github.com/GZhuJJ/SoftwareTestingCourse"},
                {"3016207275", "李朝晖", "https://github.com/Lzhaohui"},
                {"3016214077", "赵明洋", "https://github.com/ZhaoMingYang-tju"},
                {"3016218165", "艾孜哈尔·艾合买提", "https://github.com/azhar241892"},
                {"3016218166", "邓皓岩", "https://github.com/husuhusuhusu"},
                {"3016218167", "方诚彦", "https://github.com/DemonTimor"},
                {"3016218168", "韩晨", "https://github.com/JoHnHC"},
                {"3016218169", "何昊", "https://github.com/ritian-hh"},
                {"3016218170", "黄冬梅", "https://github.com/hdm926"},
                {"3016218171", "黄正文", "https://github.com/AWenXiong"},
                {"3016218172", "李沛霖", "https://github.com/SSFDLware/software-testing"},
                {"3016218173", "刘梦真", "https://github.com/yangyi66"},
                {"3016218174", "刘文海", "https://gitee.com/tju_hei/software_test.git"},
                {"3016218175", "刘洋", "https://github.com/liuyang806"},
                {"3016218176", "莫纯谊", "mcyatom@gmail.com"},
                {"3016218177", "邱足天", "https://github.com/ElegantQiu"},
                {"3016218178", "宋琦琪", "https://github.com/sqq7777"},
                {"3016218179", "隋名本", "https://github.com/suimingben"},
                {"3016218180", "孙琦淞", "https://github.com/sqis777?tab=repositories"},
                {"3016218181", "孙昊", "https://culturepanda.github.io/SoftwareTesting/"},
                {"3016218182", "王志航", "https://github.com/YourBrotherTT/softwareTesting.git"},
                {"3016218183", "吴可歆", "https://github.com/guuuuji/Software-test.git"},
                {"3016218184", "谢荣升", "https://github.com/fallentree"},
                {"3016218186", "叶翰华", "https://github.com/MarcusNerva"},
                {"3016218187", "依力格尔·麦提尼亚孜", "https://github.com/ilgarrr"},
                {"3016218188", "岳明宇", "https://github.com/githaub/homework.git"},
                {"3016218189", "张永佳", "https://github.com/llmgpty/tjuscsst.git"},
                {"3016218190", "赵仲琳", "https://github.com/ZhonglinZ"},
                {"3016218191", "祝开元", "https://github.com/ZHUKAIYUAN0/test"},
                {"3016218192", "邹璐文", "https://github.com/jianxin-YL"},
        });
    }

    @Test
    public void testSCS() throws Exception {
        driver.get(baseUrl + "/");
        WebElement elementId = driver.findElement(By.name("id"));
        elementId.sendKeys(studentId);
        WebElement elementPass = driver.findElement(By.name("password"));
//        System.out.println(password);
        elementPass.sendKeys(password);
        driver.findElement(By.cssSelector("[type=submit]")).click();
        assertEquals(studentName, driver.findElement(By.id("student-name")).getText());
        assertEquals(studentGit, driver.findElement(By.id("student-git")).getText());
    }

    @After
    public void tearDown() throws Exception {
//    driver.quit();
//    String verificationErrorString = verificationErrors.toString();
//    if (!"".equals(verificationErrorString)) {
//      fail(verificationErrorString);
//    }
    }
}

