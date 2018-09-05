import com.here.gradle.plugins.jobdsl.util.DslConfig

def members = ["Renzo", "Stefan", "Yonah", "Dror", "Nati", "Alex", "Yogev"]
def greeting = DslConfig.get('greeting')
members.each { member ->
    job("hello-${member}") {
        triggers {
            scm('*/15 * * * *')
        }
        steps {
            shell("echo '${greeting} ${member}!'")
        }
    }
}
