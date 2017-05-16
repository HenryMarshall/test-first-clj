# test-first-clj

Created in the spirit of [testfirst.org](http://testfirst.org/), test-first-clj
strives to teach clojure and introduce some of it's tooling at the same time.
Many of today's [most](http://www.codecademy.com/) popular
[learn-to-code](https://www.codeschool.com/) tools are dressed up unit tests, but
using them in that environment deprives the learner of grokking the power of
testing, and keeps the syntax secret.

The `test-first-clj` library is still very much a work in progress. If you have
an idea for a kata, or would like to help port over coding exercises from another
language PRs are very much welcome!


## Installation

- Install [lein](https://leiningen.org/)
- Run `git clone https://github.com/HenryMarshall/test-first-clj`
- `cd test-first-clj`
- `lein deps`

## Usage

- Run `lein test-refresh :only test-first-clj.00-greet-test`
- Create `src/test_first_clj/00_greet.clj`
- Make the tests pass!
- Kill the lein process (Control-c)
- Run `lein test-refresh` again, replacing `00-greet-test` with the next assignment

## Tips

When you first get started, clojure.test won't give you a pretty list of failing
tests because it won't be able to load the dependencies. You'll see something like
the following:

> Exception in thread "main" java.io.FileNotFoundException: Could not locate test_first_clj/00_greet__init.class or test_first_clj/00_greet.clj on classpath.

Just create the appropriate src file to proceed.

----

Likewise, clojure may complain that it's "unable to resolve symbol". That likely
means it can't find the appropriately named function. Create it in the src file.

> Exception in thread "main" java.lang.RuntimeException: Unable to resolve symbol: greet in this context, compiling:(test_first_clj/00_greet_test.clj:7:10)

## Todo

- Add different `profiles.clj` files in different branches to make various
REPL based testilng workflows more convenient.


## License

Copyright © 2017 Henry Marshall

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
