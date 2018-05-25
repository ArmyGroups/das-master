package com.kentrasoft.generator;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URISyntaxException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * 描述：MyBatis逆向工程
 *
 * @author zhangmengkang
 * @date 2018-5-11 15:24:58
 */
public class StartUp {
    public static void main(String[] args) throws URISyntaxException {
        try {
            List<String> warnings = new ArrayList<String>();
    		boolean overwrite = true;
    		// 指定 逆向工程配置文件
    		//File configFile = new File("generatorConfig.xml");
            //使用类加载器读取文件
            String url = StartUp.class.getClassLoader().getResource("generatorConfig.xml").getPath();
            FileInputStream configFile = new FileInputStream(url);

    		ConfigurationParser cp = new ConfigurationParser(warnings);
    		Configuration config = cp.parseConfiguration(configFile);
    		DefaultShellCallback callback = new DefaultShellCallback(overwrite);
    		MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
    		myBatisGenerator.generate(null);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (InvalidConfigurationException e) {
            e.printStackTrace();
        } catch (XMLParserException e) {
            e.printStackTrace();
        }
    }
}